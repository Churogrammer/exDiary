package com.duniv.exdiary.domain.employee;

import com.duniv.duf.domain.Common;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public class Employee extends Common {
    @Id
    protected Integer employeeId;
    String employeeLoginId;
    String employeePw;
    String employeeName;
    String employeeDepartmentId;
    String employeeTel;
    String employeeEmail;
    String companyId;
    protected boolean validateYn;
    protected boolean contactorYn;

    public void registerYn(){
        this.validateYn = false;
        this.contactorYn = false;
    }

}

