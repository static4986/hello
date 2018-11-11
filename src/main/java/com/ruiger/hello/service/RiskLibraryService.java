package com.ruiger.hello.service;

import com.ruiger.hello.pojo.Risklibrary;

public interface RiskLibraryService {
    Risklibrary queryByCode(String id);
}
