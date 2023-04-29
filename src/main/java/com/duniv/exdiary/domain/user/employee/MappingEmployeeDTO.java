package com.duniv.exdiary.domain.user.employee;

import com.duniv.duf.domain.tools.StringTools;
import com.duniv.exdiary.domain.company.Company;
import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public Employee registerEmployee(EmployeeRegisterDTO dto){
        return new Employee(dto.getLoginId(), dto.getPassword(), dto.getCompany()
            , dto.getName(), dto.getPhoneNumber(), dto.getEmail());
    }
}
