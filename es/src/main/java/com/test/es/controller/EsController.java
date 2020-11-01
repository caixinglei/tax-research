package com.test.es.controller;

import com.test.es.repository.EsRepository;
import com.test.es.repository.EsRepository1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class EsController {

    @Autowired
    private EsRepository esRepository;

    @Autowired
    private EsRepository1 esRepository1;

    @GetMapping("/b")
    public void bac(){
        System.out.println("sssss");


    }

}
