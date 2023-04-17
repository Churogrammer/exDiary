package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.user.employee.Employee;
import com.duniv.exdiary.domain.user.employee.EmployeeRegisterDTO;
import com.duniv.exdiary.domain.user.employee.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class EmployeeRegisterServiceTest {
    @Autowired
    private EmployeeRegisterService registerService;
    @Autowired
    private EmployeeService employeeService;

    @Test
    @Transactional
    public void addCompany(){

    }
    @Test
    @Transactional
    public void registerTest(){
        EmployeeRegisterDTO dto = EmployeeRegisterDTO.builder()
                        .loginId("kds9410311").password("kdsh1031").email("kds941031@naver.com")
                        .phoneNumber("010-8310-1501").companyId("samsung2").departmentId(null).build();
        registerService.registerEmployee(dto);
    }

    @Test
    //@Transactional
    public void registerEmployeeTest(){
        EmployeeRegisterDTO dto = EmployeeRegisterDTO.builder()
                .loginId("11111111111")
                .password("12345")
                .departmentId("sss")
                .phoneNumber("010-8310-1501")
                .email("kds941031@naver.com")
                .companyId("samsung")
                .build();

        employeeService.registerEmployee(dto);
    }



}