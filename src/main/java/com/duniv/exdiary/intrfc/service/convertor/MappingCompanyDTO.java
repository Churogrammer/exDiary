package com.duniv.exdiary.domain.company;

import com.duniv.exdiary.define.DConst;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;

public class MappingCompanyDTO {

    public Company registerCompany(CompanyRegisterDTO dto){
        return Company.builder()
                .companyName(dto.getCompanyName())
                .corporateNumber(dto.getCorporateNumber())
                .confirmYn(false)
                .build();
    }
}
