package com.duniv.exdiary.domain.user.employee;

import com.duniv.exdiary.domain.company.Company;
import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public Employee registerEmployee(EmployeeRegisterDTO dto){
        return Employee.builder().loginId(dto.getEmployeeLoginId())
                .password(dto.getEmployeePw())
                .departmentId(dto.getEmployeeDepartmentId())
                .company(new Company(dto.getCompanyId()))
                .build();
    }
}
