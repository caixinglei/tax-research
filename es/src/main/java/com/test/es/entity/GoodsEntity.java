package com.test.es.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "test_goods")
@AllArgsConstructor
@NoArgsConstructor
public class GoodsEntity {

    // 用于将对象中的id属性与文档id一一对应
    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String goodsName;

    @Field(type = FieldType.Text)
    private String sku;

    @Field(type = FieldType.Text)
    private String spu;

}



