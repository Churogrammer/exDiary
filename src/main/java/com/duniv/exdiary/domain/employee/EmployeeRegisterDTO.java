package com.duniv.exdiary.domain.employee;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeRegisterDTO {
    String employeeLoginId;
    String employeePw;
    String employeeName;
    String employeeDepartmentId;
    String employeeTel;
    String employeeEmail;
    String companyId;
}
