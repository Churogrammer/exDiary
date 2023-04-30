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
@NoArgsConstructor
public class Employee extends User {
    String loginId;
    String password;
    @ManyToOne
    @JoinColumn(name = "companyId")
    Company company;
    protected boolean validateYn;
    protected boolean contactorYn;

    public void registerYn(){
        this.validateYn = false;
        this.contactorYn = false;
    }

    public Employee(String loginId, String password
                        , String name, String phoneNumber, String email) {
        super(name, phoneNumber, email);

        this.loginId = loginId;
        this.password = password;

        this.registerYn();
    }
}

