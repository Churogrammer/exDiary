package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.Company;
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
        if(!employeeService.validateIdAvailability(dto.getLoginId())){
            // 해당 계정은 사용할 수 없습니다.
            // TODO Exception
        }

        // 회사 존재 확인
        // 1. 회사 아이디 입력안함
        // -> 회사 등록 안함

        // 2. 회사 아이디 입력함
        if(null != dto.getCompanyId()){
            //Company company = companyService.getCompanyEntityById(dto.getCompanyId());
            Company company = companyService.getConfirmedCompanyById(dto.getCompanyId());

            // 회시기 존재하지 않습니다
            if(company == null){
                // Exception
                return;
            }

            // 회사가 존재하지만 승인되지 않음
            dto.updateCompany(company);
            if(!company.isConfirmYn()){
                // 일단 등록은 됨
            }
        }

        // 계정 등록
        employeeService.registerEmployee(dto);

        // 회사 존재하지 않으면 나중에 등록하는 형태로

    }
}
