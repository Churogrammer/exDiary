package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.intrfc.exception.ApiException;
import com.duniv.exdiary.intrfc.exception.ErrorCode;
import com.duniv.exdiary.intrfc.service.convertor.MappingCompanyDTO;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class CompanyRegisterService {
    private final CompanyService companyService;

    @Transactional
    public void initCompany(CompanyRegisterDTO dto){
        if(companyService.isExistCompanyByCorporateNumber(dto.getCorporateNumber())){
            throw new ApiException(ErrorCode.ALREADY_EXIST_COMPANY);
        }


        MappingCompanyDTO mappingCompanyManager = new MappingCompanyDTO();
        Company company = mappingCompanyManager.registerCompany(dto);
        companyService.save(company);
    }
}
