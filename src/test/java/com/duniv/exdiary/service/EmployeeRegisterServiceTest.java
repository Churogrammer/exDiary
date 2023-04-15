package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.user.employee.EmployeeRegisterDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class EmployeeRegisterServiceTest {
    @Autowired
    private EmployeeRegisterService registerService;

    @Test
    @Transactional
    public void addCompany(){

    }
    @Test
    @Transactional
    public void registerTest(){
        EmployeeRegisterDTO dto = EmployeeRegisterDTO.builder()
                        .employeeLoginId("kds9410311").employeePw("kdsh1031").employeeEmail("kds941031@naver.com")
                        .employeeTel("010-8310-1501").companyId("samsung2").employeeDepartmentId(null).build();
        registerService.registerEmployee(dto);
    }


}