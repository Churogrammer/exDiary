package com.duniv.exdiary.intrfc.service;

import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.domain.user.employee.Employee;
import com.duniv.exdiary.domain.user.employee.EmployeeRegisterDTO;
import com.duniv.exdiary.domain.user.employee.EmployeeService;
import com.duniv.exdiary.intrfc.exception.ApiException;
import com.duniv.exdiary.intrfc.exception.ErrorCode;
import com.duniv.exdiary.intrfc.service.convertor.MappingEmployeeDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class EmployeeRegisterService {
    private final EmployeeService employeeService;
    private final MappingEmployeeDTO mappingEmployeeManager;
    private final CompanyService companyService;

    public void registerEmployee(EmployeeRegisterDTO dto){
        // 계정 중복 확인
        if(!employeeService.validateIdAvailability(dto.getLoginId())){
            throw new ApiException(ErrorCode.EXIST_LOGIN_ID);
        }

        // 회사 존재 확인
        // 1. 회사 아이디 입력안함
        // -> 회사 등록 안함

        // 2. 회사 아이디 입력함
        if(null != dto.getCompanyId()){
            Company company = companyService.getCompanyEntityById(dto.getCompanyId());

            // 가입되지 않은 기업
            if(company == null){
                throw new ApiException(ErrorCode.NO_COMPANY);
            }

            // 승인이 완료되지 않은 기업
            if(!company.isConfirmYn()){
                throw new ApiException(ErrorCode.NOT_CONFIRMED_COMPANY);
            }
        }

        // 계정 등록
        Employee employee = mappingEmployeeManager.registerEmployee(dto);
        employeeService.registerEmployee(dto);

        // 기업이 유효하지 않으면 나중에 등록

    }
}
