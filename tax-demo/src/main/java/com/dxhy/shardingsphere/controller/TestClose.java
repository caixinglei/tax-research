package com.dxhy.shardingsphere.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// @Component
public class TestClose implements ApplicationContextAware {
    @Autowired
    private ShardingSphereController shardingSphereController;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        autowireCapableBeanFactory.destroyBean(shardingSphereController);

    }
}
