package com.duniv.exdiary.domain.employee;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.company.CompanyEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public class Employee extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer employeeId;
    String employeeLoginId;
    String employeePw;
    String employeeName;
    String employeeDepartmentId;
    String employeeTel;
    String employeeEmail;
    @ManyToOne
    CompanyEntity company;
    protected boolean validateYn;
    protected boolean contactorYn;

    public void registerYn(){
        this.validateYn = false;
        this.contactorYn = false;
    }

    public void setCompany() throws Exception {
        if(company != null){
            throw new Exception("");
        }
    }


}

