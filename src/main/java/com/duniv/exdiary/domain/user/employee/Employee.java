package com.duniv.exdiary.domain.user.employee;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.company.Company;
import com.duniv.exdiary.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@DiscriminatorValue("EMPLOYEE")
public class Employee extends User {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //protected Integer employeeId;
    String loginId;
    String password;
    String departmentId;
    @ManyToOne
    @JoinColumn(name = "companyId")
    Company company;
    protected boolean validateYn;
    protected boolean contactorYn;

    public void registerYn(){
        this.validateYn = false;
        this.contactorYn = false;
    }

    public void setCompany() throws Exception {
//        if(company != null){
//            throw new Exception("");
//        }
    }


}

