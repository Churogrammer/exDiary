package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.domain.user.employee.EmployeeRegisterDTO;
import com.duniv.exdiary.domain.user.employee.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeRegisterService {
    private final EmployeeService employeeService;
    private final CompanyService companyService;

    public void registerEmployee(EmployeeRegisterDTO dto){
        // 계정 중복 확인
        if(!employeeService.validateIdAvailability(dto.getEmployeeLoginId())){
            // 해당 계정은 사용할 수 없습니다.
            // TODO Exception
        }

        // 회사 존재 확인
        // 1. 회사 아이디 입력안함
        // -> 회사 등록 안함

        // 2. 회사 아이디 입력함
        if(null != dto.getCompanyId()){
            // 2-1. 회사 존재 -> certification 등록
//            if(!companyService.isExistCompany(dto.getCompanyId())){
//                // 2-2. 회사 존재하지 않음
//                // TODO Exception
//            }
        }

        //

        // 계정 등록
        employeeService.registerEmployee(dto);
        // 회사 존재하지 않으면 나중에 등록하는 형태로

    }
}
