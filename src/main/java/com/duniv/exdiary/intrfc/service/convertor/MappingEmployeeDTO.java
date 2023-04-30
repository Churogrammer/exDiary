package com.duniv.exdiary.intrfc.service.convertor;

import com.duniv.duf.domain.tools.StringTools;
import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.domain.user.employee.Employee;
import com.duniv.exdiary.domain.user.employee.EmployeeRegisterDTO;
import org.springframework.stereotype.Component;

@Component
public class MappingEmployeeDTO {
    public Employee registerEmployee(EmployeeRegisterDTO dto){
        return new Employee(dto.getLoginId(), dto.getPassword(), dto.getName(), dto.getPhoneNumber(), dto.getEmail());
    }
}
