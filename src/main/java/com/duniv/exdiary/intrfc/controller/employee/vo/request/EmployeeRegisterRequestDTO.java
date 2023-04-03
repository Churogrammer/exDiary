package com.duniv.exdiary.intrfc.controller.employee.vo.request;

import com.duniv.exdiary.domain.employee.EmployeeRegisterDTO;

public class EmployeeRegisterRequestDTO {
    String id;
    String pw;
    String name;
    String departmentId;
    String tel;
    String email;

    public EmployeeRegisterDTO toServiceDto(){
        return EmployeeRegisterDTO.builder()
                .employeeLoginId(id).employeePw(pw).employeeName(name).employeeDepartmentId(departmentId)
                .employeeTel(tel).employeeEmail(email).build();
    }
}
