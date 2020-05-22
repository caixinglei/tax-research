package com.dxhy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan(basePackages = {"com.dxhy.**.dao"})
@SpringBootApplication(scanBasePackages = {"com.dxhy"})
@EnableSwagger2
public class TaxDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(TaxDemoApplication.class, args);
    }

}
