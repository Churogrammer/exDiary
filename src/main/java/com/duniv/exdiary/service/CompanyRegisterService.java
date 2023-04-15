package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.domain.company.MappingCompanyDTO;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyRegisterService {

    private final CompanyService companyService;

    public void initCompany(CompanyRegisterDTO dto){
        MappingCompanyDTO mapping = new MappingCompanyDTO();
        Company company = mapping.registerCompany(dto);
        companyService.save(company);
    }
}
