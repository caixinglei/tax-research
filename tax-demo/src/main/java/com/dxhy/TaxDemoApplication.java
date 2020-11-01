package com.dxhy;


import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;


// @MapperScan(basePackages = {"com.dxhy.**.dao"})
@SpringBootApplication(scanBasePackages = {"com.dxhy"},
        exclude = {MybatisPlusAutoConfiguration.class, DataSourceAutoConfiguration.class})
@EnableSwagger2
@EnableScheduling
@Slf4j
public class TaxDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaxDemoApplication.class, args);
    }

    // @Scheduled(cron = "0/1 * * * * ?")
    public void schedule(){
        log.info("打印日志");
    }

}
