package com.duniv.exdiary.domain.user.employee;

import com.duniv.exdiary.domain.company.CompanyEntity;
import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public EmployeeEntity registerEmployee(EmployeeRegisterDTO dto){
        return EmployeeEntity.builder().employeeLoginId(dto.getEmployeeLoginId())
                .employeePw(dto.getEmployeePw()).employeeEmail(dto.getEmployeeEmail())
                .employeeDepartmentId(dto.getEmployeeDepartmentId()).employeeTel(dto.getEmployeeTel())
                .company(new CompanyEntity(dto.getCompanyId()))
                .build();
    }
}
