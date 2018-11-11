package com.ruiger.hello.service.impl;

import com.ruiger.hello.dao.IssuepointtransitiondetailDao;
import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import com.ruiger.hello.service.IssuePointTransitionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssuePointTransitionDetailImpl implements IssuePointTransitionDetailService {

    @Autowired
    private IssuepointtransitiondetailDao issuepointtransitiondetailDao;

    @Override
    public Issuepointtransitiondetail queryById(Integer id) {
        return issuepointtransitiondetailDao.queryById(id);
    }
}
