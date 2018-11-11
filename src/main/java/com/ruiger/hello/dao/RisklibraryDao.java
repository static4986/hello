package com.ruiger.hello.dao;

import com.ruiger.hello.pojo.Risklibrary;
import com.ruiger.hello.pojo.RisklibraryExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RisklibraryDao {
    int countByExample(RisklibraryExample example);

    int deleteByExample(RisklibraryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Risklibrary record);

    int insertSelective(Risklibrary record);

    List<Risklibrary> selectByExample(RisklibraryExample example);

    Risklibrary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Risklibrary record, @Param("example") RisklibraryExample example);

    int updateByExample(@Param("record") Risklibrary record, @Param("example") RisklibraryExample example);

    int updateByPrimaryKeySelective(Risklibrary record);

    int updateByPrimaryKey(Risklibrary record);

    Risklibrary queryByCode(@Param("riskCode") String riskCode);
}