package com.dxhy.shardingsphere.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dxhy.shardingsphere.entity.TaxReportDataStorageEntity;
import com.dxhy.shardingsphere.entity.TestEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface ShardingSphereDao extends BaseMapper<TaxReportDataStorageEntity> {

    TestEntity queryList(@Param("taskId") String taskId);

    List<Map<String, Object>> selectTaxReportDataStorageByJoin();

    void insertTaxReportDataStorage(TaxReportDataStorageEntity taxReportDataStorageEntity);


}
