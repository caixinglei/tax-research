package com.test.es.repository;

import com.test.es.entity.GoodsEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsRepository extends ElasticsearchRepository<GoodsEntity,String> {
}
