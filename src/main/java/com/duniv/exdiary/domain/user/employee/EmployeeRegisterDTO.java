package com.duniv.exdiary.domain.user.employee;

import com.duniv.exdiary.domain.company.Company;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeRegisterDTO {
    private String loginId;
    private String password;
    private String name;
    private String departmentId;
    private String phoneNumber;
    private String email;
    private String companyId;
    private Company company;

    public void updateCompany(Company company){
        this.company = company;
    }
}
