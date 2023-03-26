package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.user.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserJpaTestServiceTest {

    @Autowired
    private UserJpaTestService testService;
    @Test
    void hasBuilderContext() {
        testService.hasBuilderContext("user1234", "kds941031", "chuchu");
    }
}