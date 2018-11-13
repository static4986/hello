package com.ruiger.hello.controller;

import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import com.ruiger.hello.pojo.ResultCheck;
import com.ruiger.hello.pojo.Risklibrary;
import com.ruiger.hello.service.IssuePointTransitionDetailService;
import com.ruiger.hello.service.RiskLibraryService;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    @Autowired
    private RiskLibraryService riskLibraryService;

    @Autowired
    private IssuePointTransitionDetailService issue;

    @RequestMapping(value = "/drools")
    @ResponseBody
    public Risklibrary helloMethod(String id){

        Risklibrary risklibrary = riskLibraryService.queryByCode(id);
        return risklibrary;
    }

    /*@Resource
    private KieSession kieSession;*/

    @Resource
    private KieBase kieBase;

    @ResponseBody
    @RequestMapping("/risk")
    public String test(Integer id) {
        KieSession kieSession = kieBase.newKieSession();
        String result=new String();
        Issuepointtransitiondetail issueDetail1 = issue.queryById(id);
        Risklibrary risklibrary=riskLibraryService.queryByCode("1");
        ResultCheck resultCheck=new ResultCheck();
        FactHandle insert = kieSession.insert(risklibrary);
        FactHandle insert1 = kieSession.insert(issueDetail1);
        FactHandle insert2 = kieSession.insert(resultCheck);
        int ruleFiredCount = kieSession.fireAllRules();
        kieSession.delete(insert);
        kieSession.delete(insert1);
        kieSession.delete(insert2);
        //kieSession.dispose();
        System.out.println("触发了" + ruleFiredCount + "条规则");
        if (resultCheck.isPass()) {
            System.out.println("积分未超过"+risklibrary.getRiskanswer()+",规则校验通过");
            result="积分未超过"+risklibrary.getRiskanswer()+",规则校验通过";
        }else {
            System.out.println("积分已经超过"+risklibrary.getRiskanswer()+",不符合规定，请及时处理");
            result="积分已经超过"+risklibrary.getRiskanswer()+",不符合规定，请及时处理";
        }
        return result;
    }

    @ResponseBody
    @RequestMapping("/listTest")
    public String listTest(String phone,String department) {
        KieSession kieSession = kieBase.newKieSession();
        String result=null;
        List<Risklibrary> risklibraries = riskLibraryService.queryList("org", "202", "issuePoint");
        risklibraries.forEach(c->kieSession.insert(c));
        List<Risklibrary> daysLimitList = risklibraries.stream()
                                                       .filter(c -> "days".equals(c.getRiskvalue()))
                                                       .collect(Collectors.toList());
        for (Risklibrary r:daysLimitList) {
            Integer queryDays = Integer.valueOf(r.getRiskanswer());
            LocalDate startDay=LocalDate.now().minusDays(queryDays-1);
            Integer totalNum = issue.queryNumByPhontAndOrg(department, phone, startDay);
            ResultCheck resultCheck=new ResultCheck();
            resultCheck.setCount(totalNum);
            resultCheck.setRiskanswer(r.getRiskanswer());
            kieSession.insert(resultCheck);
        }
        int ruleFiredCount = kieSession.fireAllRules();
        kieSession.destroy();
        System.out.println("触发了" + ruleFiredCount + "条规则");
        System.out.println("*************************************************************************");
        return result;
    }
}
