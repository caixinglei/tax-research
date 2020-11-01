package com.dxhy.shardingsphere.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.dxhy.shardingsphere.dao.ShardingSphereDao;
import com.dxhy.shardingsphere.dao.TestDao;
import com.dxhy.shardingsphere.entity.TaxReportDataStorageEntity;
import com.dxhy.shardingsphere.entity.TestEntity;
import com.dxhy.shardingsphere.service.ShardingSphereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShardingSphereServiceImpl implements ShardingSphereService {

    // @Autowired
    private ShardingSphereDao shardingSphereDao;

    // @Autowired
    private TestDao testDao;

    @Override
    public List<TaxReportDataStorageEntity> queryList() {

        return shardingSphereDao.selectList(new LambdaQueryWrapper<TaxReportDataStorageEntity>()
                .eq(TaxReportDataStorageEntity::getTaskId, "100")
                .eq(TaxReportDataStorageEntity::getSummaryFlag, 0)
                .eq(TaxReportDataStorageEntity::getProvision, 1));


    }

    @Override
    public void insertTaxReportDataStorage() {
        TaxReportDataStorageEntity taxReportDataStorageEntity = new TaxReportDataStorageEntity();
        taxReportDataStorageEntity.setProvision("1");
        taxReportDataStorageEntity.setSpreadWorkbookTagId("10");
        taxReportDataStorageEntity.setTaskId("100");
        taxReportDataStorageEntity.setSummaryFlag("0");
        taxReportDataStorageEntity.setValue("2020读写分离分表");
        shardingSphereDao.insert(taxReportDataStorageEntity);
    }


    @Override
    public void insertTest() {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("202010");
        testDao.insert(testEntity);
    }


    @Override
    public List<Map<String, Object>> selectTaxReportDataStorageByJoin() {
        return shardingSphereDao.selectTaxReportDataStorageByJoin();
    }
}
