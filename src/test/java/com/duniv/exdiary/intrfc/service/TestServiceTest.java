package com.duniv.exdiary.intrfc.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

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

    @Test
    void getAppCtxt(){
        service.hasListEntity();
        System.out.println("----------- Test");
        //service.hasRowEntity();
    }
}