package com.ruiger.hello.controller;

import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import com.ruiger.hello.pojo.ResultCheck;
import com.ruiger.hello.pojo.Risklibrary;
import com.ruiger.hello.service.IssuePointTransitionDetailService;
import com.ruiger.hello.service.RiskLibraryService;
import org.apache.ibatis.annotations.Param;
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
    private KieSession kieSession;

    @ResponseBody
    @RequestMapping("/address")
    public void test(Integer id) {
        Issuepointtransitiondetail issueDetail1 = issue.queryById(id);
        Risklibrary risklibrary=riskLibraryService.queryByCode("100");
        ResultCheck resultCheck=new ResultCheck();
        kieSession.insert(risklibrary);
        kieSession.insert(issueDetail1);
        kieSession.insert(resultCheck);
        int ruleFiredCount = kieSession.fireAllRules();
        System.out.println("触发了" + ruleFiredCount + "条规则");
        if (resultCheck.isPass()) {
            System.out.println("积分未超过"+risklibrary.getRiskvalue()+",规则校验通过");
        }else if(!resultCheck.isPass()){
            System.out.println("积分已经超过"+risklibrary.getRiskvalue()+",不符合规定，请及时处理");

        }else {
            System.out.println("nonononononono");
        }
    }
}