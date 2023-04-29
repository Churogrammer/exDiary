package com.duniv.exdiary.intrfc.controller.employee.dto.request;

import com.duniv.exdiary.domain.user.employee.EmployeeRegisterDTO;

public class EmployeeRegisterRequestDTO {
    String id;
    String pw;
    String name;
    String companyId;
    String departmentId;
    String tel;
    String email;

    public EmployeeRegisterDTO toServiceDto(){
        return EmployeeRegisterDTO.builder()
                .loginId(id).password(pw).name(name).companyId(companyId)
                .phoneNumber(tel).email(email).build();
    }
}
