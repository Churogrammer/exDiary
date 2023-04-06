package com.duniv.exdiary.domain.employee;

import com.duniv.exdiary.define.DConst;
import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public EmployeeEntity registerEmployee(EmployeeRegisterDTO dto){
        return EmployeeEntity.builder().employeeLoginId(dto.getEmployeeLoginId())
                .employeePw(dto.getEmployeePw()).employeeEmail(dto.getEmployeeEmail())
                .employeeDepartmentId(dto.getEmployeeDepartmentId()).employeeTel(dto.getEmployeeTel())
                .companyId(dto.getCompanyId()).validateYn(false).contatctorYn(false)
                .build();
    }
}
