package com.ruiger.hello.service;

import com.ruiger.hello.pojo.Risklibrary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RiskLibraryService {
    Risklibrary queryByCode(String id);

    List<Risklibrary> queryList(String riskType,String riskName,String riskCode);

    Risklibrary selectById(Integer id);




}
