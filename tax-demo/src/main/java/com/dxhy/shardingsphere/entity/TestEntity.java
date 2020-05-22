package com.dxhy.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("test")
public class TestEntity {
    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    private String name;
}
