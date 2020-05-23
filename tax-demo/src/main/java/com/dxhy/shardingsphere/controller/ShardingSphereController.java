package com.dxhy.shardingsphere.controller;

import com.dxhy.shardingsphere.dao.ShardingSphereDao;
import com.dxhy.shardingsphere.entity.TaxReportDataStorageEntity;
import com.dxhy.shardingsphere.entity.TestEntity;
import com.dxhy.shardingsphere.service.ShardingSphereService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("shardingSphere")
@Api("分表")
public class ShardingSphereController {

    @Autowired
    private ShardingSphereService shardingSphereService;
    @Autowired
    private ShardingSphereDao shardingSphereDao;


    @PostMapping("/selectTaxReportDataStorage")
    @ApiOperation("selectTaxReportDataStorage")
    public List<TaxReportDataStorageEntity> demo1() {

        List<TaxReportDataStorageEntity> taxReportDataStorages = shardingSphereService.queryList();
        return taxReportDataStorages;

    }


    @PostMapping("/insertTaxReportDataStorage")
    @ApiOperation("insertTaxReportDataStorage")
    public void demo2() {

        shardingSphereService.insertTaxReportDataStorage();

    }


    @PostMapping("/insertTest")
    @ApiOperation("insertTest")
    public void dem3() {

        shardingSphereService.insertTest();

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

}
