package com.duniv.exdiary.domain.user.employee;

import com.duniv.exdiary.domain.company.Company;
import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public Employee registerEmployee(EmployeeRegisterDTO dto){
        return Employee.builder().employeeLoginId(dto.getEmployeeLoginId())
                .employeePw(dto.getEmployeePw()).employeeEmail(dto.getEmployeeEmail())
                .employeeDepartmentId(dto.getEmployeeDepartmentId()).employeeTel(dto.getEmployeeTel())
                .company(new Company(dto.getCompanyId()))
                .build();
    }
}
