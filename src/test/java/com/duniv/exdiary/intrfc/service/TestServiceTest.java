package com.duniv.exdiary.intrfc.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestServiceTest {

    @Autowired
    private TestService service;

    @Autowired
    StringRedisTemplate redisTemplate;
    @Test
    void getRedisData() {
        //service.getRedisData(redisTemplate);
    }

    // service.transactional();

    @Test
    void getAppCtxt(){
        service.hasListEntity();
        System.out.println("----------- Test");
        //service.hasRowEntity();
    }
    //
    //
    @Test
    @Transactional
    void getTransactionalTest(){
        System.out.println("-------------------- [NoTransactional]");
        service.noTransactional("id_0");
        System.out.println("-------------------- [Transactional]");
        service.transactional("id_0");

    }

    @Test
    void getListTransactional(){
        service.findAllTransaction();
        //service.findAllByIdTransaction();
    }

    @Test
    public void getRowTransactional(){
        service.findById("id_0");
    }

    @Test
    @Transactional
    public void findTransactional(){
        service.findAllByIdTransaction();
        service.findById("id_0");
    }


        //service.findAllByIdTransaction();
        //System.out.println("-------------------- [findById]");
        //System.out.println("-------------------- [findById]");
}