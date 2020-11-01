package com.test.es;

import com.test.es.entity.GoodsEntity;
import com.test.es.repository.EsRepository;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Arrays;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class EsApplicationTests {

    @Autowired
    private EsRepository esRepository;


    @Test
    public void testEs(){
        GoodsEntity goodsEntity = new GoodsEntity();
        goodsEntity.setId("1728378");
        goodsEntity.setGoodsName("uuuuu");
        goodsEntity.setSku("4324324");
        goodsEntity.setSpu("ererewre");
        GoodsEntity goodsEntity1 = new GoodsEntity();
        goodsEntity1.setId("1728379");
        goodsEntity1.setGoodsName("商品1");
        goodsEntity1.setSku("4324324");
        goodsEntity1.setSpu("ererewre");

        esRepository.saveAll(Arrays.asList(goodsEntity,goodsEntity1));

        // esRepository.delete(goodsEntity);



    }

    @Test
    @Transactional
    public void testQuery() throws IOException {

//        SearchRequest searchRequest = new SearchRequest("test_googs");
//        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
//        searchSourceBuilder.query(QueryBuilders.termQuery("goodsName","uu"));
//
//        searchRequest.types("goodsentity").source(searchSourceBuilder);
//        SearchResponse search = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
//
//        SearchHit[] hits = search.getHits().getHits();
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        esRepository.search(QueryBuilders.fuzzyQuery("goodsName", "商")).forEach(a-> System.out.println("----打印---"+a));

        // esRepository.delete(goodsEntity);



    }

}
