package com.duniv.exdiary.domain.user;

import com.duniv.exdiary.intrfc.service.TestService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserEntityTest {


    @Autowired
    private TestService service;
    @Test
    public void getTest(){

        //service.getPickingWay("kim");
        //assertThat(10).isEqualTo(10);

    }

}