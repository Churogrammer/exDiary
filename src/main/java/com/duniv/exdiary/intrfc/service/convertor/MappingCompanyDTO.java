package com.duniv.exdiary.intrfc.service.convertor;

import com.duniv.exdiary.define.DConst;
import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MappingCompanyDTO {

    public Company registerCompany(CompanyRegisterDTO dto){
        return Company.builder()
                .companyName(dto.getCompanyName())
                .corporateNumber(dto.getCorporateNumber())
                .confirmYn(false)
                .build();
    }
}
