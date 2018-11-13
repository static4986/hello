package com.ruiger.hello.service.impl;

import com.ruiger.hello.dao.IssuepointtransitiondetailDao;
import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import com.ruiger.hello.service.IssuePointTransitionDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class IssuePointTransitionDetailImpl implements IssuePointTransitionDetailService {

    @Autowired
    private IssuepointtransitiondetailDao issuepointtransitiondetailDao;

    @Override
    public Issuepointtransitiondetail queryById(Integer id) {
        return issuepointtransitiondetailDao.queryById(id);
    }

    @Override
    public List<Issuepointtransitiondetail> queryByPhontAndOrg(String issueDepartment, String userPhone, LocalDate startDate) {
        return issuepointtransitiondetailDao.queryByPhontAndOrg(issueDepartment, userPhone, startDate);
    }

    @Override
    public Integer queryNumByPhontAndOrg(String issueDepartment, String userPhone, LocalDate startDate) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = startDate.format(fmt);

        return issuepointtransitiondetailDao.queryNumByPhontAndOrg(issueDepartment,userPhone,dateStr);
    }
}
