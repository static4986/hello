package com.ruiger.hello.dao;

import com.ruiger.hello.pojo.Issuepointtransitiondetail;
import com.ruiger.hello.pojo.IssuepointtransitiondetailExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Mapper
public interface IssuepointtransitiondetailDao {
    int countByExample(IssuepointtransitiondetailExample example);

    int deleteByExample(IssuepointtransitiondetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Issuepointtransitiondetail record);

    int insertSelective(Issuepointtransitiondetail record);

    List<Issuepointtransitiondetail> selectByExample(IssuepointtransitiondetailExample example);

    Issuepointtransitiondetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Issuepointtransitiondetail record, @Param("example") IssuepointtransitiondetailExample example);

    int updateByExample(@Param("record") Issuepointtransitiondetail record, @Param("example") IssuepointtransitiondetailExample example);

    int updateByPrimaryKeySelective(Issuepointtransitiondetail record);

    int updateByPrimaryKey(Issuepointtransitiondetail record);

    Issuepointtransitiondetail queryById(@Param("id") Integer id);

    List<Issuepointtransitiondetail> queryByPhontAndOrg(@Param("issueDepartment") String issueDepartment,
                                                        @Param("userPhone") String userPhone,
                                                        @Param("startDate") LocalDate startDate);

    Integer queryNumByPhontAndOrg(@Param("issueDepartment") String issueDepartment,
                                                        @Param("userPhone") String userPhone,
                                                        @Param("startDate") String startDate);
}