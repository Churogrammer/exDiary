package com.duniv.exdiary.service;

import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyRegisterServiceTest {

    @Autowired
    private CompanyRegisterService registerService;


    @Test
    void initCompany() {
        CompanyRegisterDTO dto = new CompanyRegisterDTO("samsung", "삼성" , "12345");

        registerService.initCompany(dto);
    }

}