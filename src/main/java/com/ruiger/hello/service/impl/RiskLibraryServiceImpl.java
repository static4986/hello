package com.ruiger.hello.service.impl;


import com.ruiger.hello.dao.RisklibraryDao;
import com.ruiger.hello.pojo.Risklibrary;
import com.ruiger.hello.service.RiskLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskLibraryServiceImpl implements RiskLibraryService {

    @Autowired
    private RisklibraryDao risklibraryDao;

    @Override
    public Risklibrary queryByCode(String code) {
        return risklibraryDao.queryByCode(code);
    }

    @Override
    public List<Risklibrary> queryList(String riskType, String riskName, String riskCode) {
        return risklibraryDao.queryList(riskType,riskName,riskCode);
    }

    @Override
    public Risklibrary selectById(Integer id) {
        return risklibraryDao.selectByPrimaryKey(id);
    }
}
