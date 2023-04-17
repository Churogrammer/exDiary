package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyRegisterServiceTest {

    @Autowired
    private CompanyRegisterService registerService;

    @Autowired
    private CompanyService companyService;


    @Test
    void initCompany() {
        CompanyRegisterDTO dto = new CompanyRegisterDTO("samsung", "삼성" , "12345");
        registerService.initCompany(dto);
    }

    @Test
    void findById(){
        Company company = companyService.getConfirmedCompanyById("samsung");
        assertNotEquals(company, null);
    }
}