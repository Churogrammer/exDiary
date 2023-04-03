package com.duniv.exdiary.domain.employee;

import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public EmployeeEntity registerEmployee(EmployeeRegisterDTO dto){
        return EmployeeEntity.builder().employeeLoginId(dto.getEmployeeLoginId())
                .employeePw(dto.getEmployeePw()).employeeEmail(dto.getEmployeeEmail())
                .employeeDepartmentId(dto.getEmployeeDepartmentId()).employeeTel(dto.getEmployeeTel())
                .build();
    }
}
