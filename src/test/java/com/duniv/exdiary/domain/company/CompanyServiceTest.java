package com.duniv.exdiary.domain.company;

import com.querydsl.core.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class CompanyServiceTest {
    @Autowired
    private CompanyService companyService;

    @Test
    void saveManyCompany(){
       // companyService.saveCompany(100);
    }
    @Test
    void selectAllCompany() {
        List<Tuple> list = companyService.selectAllCompany();
        if(list != null){
            list.stream().forEach(x->{System.out.println(x);});
        }
    }

    @Test()
    @DisplayName("삼성 테스트")
    @Transactional
    void getCompanyEntityById(){
        Company entity = companyService.getCompanyEntityById("samsung");
        assertEquals(entity, null);
        assertNotEquals(entity,null);
    }
}