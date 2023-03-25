package com.duniv.exdiary.domain.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserEntityTest {

    @Test
    public void getTest(){


        assertThat(10).isEqualTo(10);
    }

}