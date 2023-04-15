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
                .employeeLoginId(id).employeePw(pw).employeeName(name).companyId(companyId).employeeDepartmentId(departmentId)
                .employeeTel(tel).employeeEmail(email).build();
    }
}
