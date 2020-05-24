package com.dxhy.shardingsphere.config;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

public class MyKeyGenerator implements ShardingKeyGenerator {
    @Override
    public Comparable<String> generateKey() {
//        Sno wflake snowflake = IdUtil.createSnowflake(1, 1);
//        Long id = snowflake.nextId();
//        System.out.println("我自定义的id" + id);
        System.out.println("自定义id进来了");

        return "20";
    }

    @Override
    public String getType() {
        return "MyKeyGenerator";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }

}
