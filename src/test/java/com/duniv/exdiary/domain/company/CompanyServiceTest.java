package com.duniv.exdiary.domain.company;

import com.querydsl.core.Tuple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;

    @Test
    void saveManyCompany(){
        companyService.saveCompany(100);
    }
    @Test
    void selectAllCompany() {
        List<Tuple> list = companyService.selectAllCompany();
        if(list != null){
            list.stream().forEach(x->{System.out.println(x);});
        }
    }
}