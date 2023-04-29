package com.duniv.exdiary.domain.company;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class CompanyDTO extends Company{

//    public CompanyDTO(String companyId, String companyName, String corporateNumber, boolean confirmYn) {
//       // super(companyId, companyName, corporateNumber, confirmYn);
//    }

    public Company toEntity(){
        return Company.builder().companyName(companyName).corporateNumber(corporateNumber).build();
    }
}
