package com.dxhy.shardingsphere.config;


import com.dxhy.shardingsphere.dao.ShardingSphereDao;
import com.dxhy.shardingsphere.entity.TestEntity;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Objects;

@Slf4j
@Component
public class TaxTestPreciseAlgorithm implements PreciseShardingAlgorithm<String>, ApplicationContextAware {
    @Autowired
    private static ApplicationContext applicationContext;

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {

        log.info("表集合------------------------------{}", collection);
        // 获取申报任务ID
        String taskId = preciseShardingValue.getValue();
        log.info("分片键taskId---------------------{}", taskId);
        // 查询任务
//        ShardingSphereDao shardingSphereDao = applicationContext.getBean("shardingSphereDao", ShardingSphereDao.class);
//        TestEntity testEntity = shardingSphereDao.queryList(taskId);
//        if (Objects.equals(testEntity.getName(), "201908")) {
//            return "tax_report_data_storage_2019";
//        } else {
//            return "tax_report_data_storage_2020";
//        }
        return "tax_report_data_storage_2020";


    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
