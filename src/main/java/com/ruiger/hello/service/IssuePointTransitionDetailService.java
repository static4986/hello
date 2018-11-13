package com.ruiger.hello.service;

import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IssuePointTransitionDetailService {
    Issuepointtransitiondetail queryById(Integer id);

    List<Issuepointtransitiondetail> queryByPhontAndOrg(String issueDepartment, String userPhone, LocalDate startDate);

    Integer queryNumByPhontAndOrg(String issueDepartment, String userPhone, LocalDate startDate);

}
