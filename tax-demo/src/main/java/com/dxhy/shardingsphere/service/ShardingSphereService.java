package com.dxhy.shardingsphere.service;

import com.dxhy.shardingsphere.entity.TaxReportDataStorageEntity;
import com.dxhy.shardingsphere.entity.TestEntity;

import java.util.List;
import java.util.Map;

public interface ShardingSphereService {

    List<TaxReportDataStorageEntity> queryList();

    void insertTaxReportDataStorage();

    void insertTest();

    List<Map<String, Object>> selectTaxReportDataStorageByJoin();

}
