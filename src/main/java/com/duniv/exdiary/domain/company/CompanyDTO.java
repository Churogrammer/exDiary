package com.duniv.exdiary.domain.company;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class CompanyDTO extends Company{

    public CompanyDTO(String companyId, String companyName, String corporateNumber) {
        super(companyId, companyName, corporateNumber);
    }

    public CompanyEntity toEntity(){
        return CompanyEntity.builder().companyId(companyId).companyName(companyName).corporateNumber(corporateNumber).build();
    }
}
