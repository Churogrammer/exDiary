package com.duniv.exdiary.domain.user.employee;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeRegisterDTO {
    private String employeeLoginId;
    private String employeePw;
    private String employeeName;
    private String employeeDepartmentId;
    private String employeeTel;
    private String employeeEmail;
    private String companyId;
}
