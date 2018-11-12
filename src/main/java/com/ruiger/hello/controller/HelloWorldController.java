package com.ruiger.hello.controller;

import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import com.ruiger.hello.pojo.ResultCheck;
import com.ruiger.hello.pojo.Risklibrary;
import com.ruiger.hello.service.IssuePointTransitionDetailService;
import com.ruiger.hello.service.RiskLibraryService;
import org.apache.ibatis.annotations.Param;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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


    @Resource
    private KieBase kieBase;

    @ResponseBody
    @RequestMapping("/risk")
    public String test(Integer id) {
        String result=new String();
        KieSession kieSession = kieBase.newKieSession();

        Issuepointtransitiondetail issueDetail1 = issue.queryById(id);
        Risklibrary risklibrary=riskLibraryService.queryByCode("1");
        ResultCheck resultCheck=new ResultCheck();
        kieSession.insert(risklibrary);
        kieSession.insert(issueDetail1);
        kieSession.insert(resultCheck);
        int ruleFiredCount = kieSession.fireAllRules();
        System.out.println("触发了" + ruleFiredCount + "条规则");
        if (resultCheck.isPass()) {
            System.out.println("积分未超过"+risklibrary.getRiskanswer()+",规则校验通过");
            result="积分未超过"+risklibrary.getRiskanswer()+",规则校验通过";
        }else {
            System.out.println("积分已经超过"+risklibrary.getRiskanswer()+",不符合规定，请及时处理");
            result="积分已经超过"+risklibrary.getRiskanswer()+",不符合规定，请及时处理";
        }
        kieSession.destroy();
        return result;
    }
}
