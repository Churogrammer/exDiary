package com.duniv.exdiary.domain.user.employee;

import com.duniv.exdiary.domain.company.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegisterDTO {
    private String loginId;
    private String password;
    private String name;
    private String phoneNumber;
    private String email;
    private String companyId;
    private Company company;

    public void updateCompany(Company company){
        this.company = company;
    }
}
