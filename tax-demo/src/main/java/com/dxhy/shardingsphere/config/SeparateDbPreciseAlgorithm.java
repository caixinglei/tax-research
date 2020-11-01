//package com.dxhy.shardingsphere.config;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
//import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//
//@Component
//@Slf4j
//public class SeparateDbPreciseAlgorithm implements PreciseShardingAlgorithm<String>, ApplicationContextAware {
//
//    private static ApplicationContext applicationContext;
//
//
//    @Override
//    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
//        // Db集合
//        log.info("DB集合-------------------{}", collection);
//
//        // 获取分片键
//        String taskId = preciseShardingValue.getValue();
//        log.info("分库分片键taskId------------------{}", taskId);
//
//        return "tax1";
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//}
