package com.dxhy.shardingsphere.service;

import com.dxhy.shardingsphere.entity.TaxReportDataStorageEntity;
import com.dxhy.shardingsphere.entity.TestEntity;

import java.util.List;

public interface ShardingSphereService {

    List<TaxReportDataStorageEntity> queryList();

    void insertTaxReportDataStorage();

    void insertTest();

}
