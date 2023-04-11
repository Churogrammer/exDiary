package com.duniv.exdiary.domain.company;

import com.duniv.exdiary.define.DConst;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;

public class MappingCompanyDTO {

    public CompanyEntity registerCompany(CompanyRegisterDTO dto){
        return CompanyEntity.builder().companyId(dto.getCompanyId())
                .companyName(dto.getCompanyName()).corporateNumber(dto.getCorporateNumber())
                .corporateNumber(DConst.YN_N)
                .build();
    }
}
