package com.dxhy.shardingsphere.controller;

import com.dxhy.shardingsphere.dao.ShardingSphereDao;
import com.dxhy.shardingsphere.entity.TaxReportDataStorageEntity;
import com.dxhy.shardingsphere.entity.TestEntity;
import com.dxhy.shardingsphere.service.ShardingSphereService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("shardingSphere")
@Api(tags = "分表")
public class ShardingSphereController {

    @Autowired
    private ShardingSphereService shardingSphereService;
    // @Autowired
    private ShardingSphereDao shardingSphereDao;



    @PostMapping("/selectTaxReportDataStorage")
    @ApiOperation("selectTaxReportDataStorage")
    public List<TaxReportDataStorageEntity> demo1() {

        List<TaxReportDataStorageEntity> taxReportDataStorages = shardingSphereService.queryList();
        return taxReportDataStorages;

    }

    @PreDestroy
    public void destroy() {


        System.out.printf("开始销毁----" + Thread.currentThread().getId());
    }

    @PostMapping("/insertTaxReportDataStorage")
    @ApiOperation("insertTaxReportDataStorage")
    public void demo2() {

        // shardingSphereService.insertTaxReportDataStorage();
        TaxReportDataStorageEntity taxReportDataStorageEntity = new TaxReportDataStorageEntity();
        taxReportDataStorageEntity.setTaskId("20");
        taxReportDataStorageEntity.setValue("手写sql");
        taxReportDataStorageEntity.setProvision("1");
        taxReportDataStorageEntity.setSummaryFlag("3");
        taxReportDataStorageEntity.setSpreadWorkbookTagId("234455");
        shardingSphereDao.insertTaxReportDataStorage(taxReportDataStorageEntity);

    }


    @PostMapping("/insertTest")
    @ApiOperation("insertTest")
    public void dem3() {
        // applicationContext.close();
        // shardingSphereService.insertTest();

    }

    @PostMapping("/getTest")
    @ApiOperation("getTest")
    public TestEntity dem4() {

        return shardingSphereDao.queryList("100");

    }

    @PostMapping("/selectTaxReportDataStorageByJoin")
    @ApiOperation("selectTaxReportDataStorageByJoin")
    public List<Map<String, Object>> demo5() {

        List<Map<String, Object>> maps = shardingSphereService.selectTaxReportDataStorageByJoin();
        return maps;

    }


    public static void main(String[] args) {
        String input = "bb aaaa cccccc sssss";
        int max = 0;
        int temp = 1;
        for (int i = 1; i < input.length(); i++) {
            char pre = input.charAt(i - 1);
            char now = input.charAt(i);
            if (now - pre == 0) {//如果是连续字符串，长度加一
                temp++;
            } else {
                //如果不是连续的字符串，对之前连续的字符串长度进行判断，看是不是目前最长的，如果是则保存
                //并且长度计算长度重新计为1
                max = (max > temp ? max : temp);
                temp = 1;
            }
        }
        //因为上面的程序没有对最后一次连续长度进行比较，所以在这里额外比较一次
        max = (max > temp ? max : temp);

        //题目要求没有连续的输出0，即没有1这个说法，所以这里进行了判断
        System.out.println((max == 1 ? 0 : max));

    }

}
