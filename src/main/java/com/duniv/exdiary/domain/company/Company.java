package com.duniv.exdiary.domain.company;

import com.duniv.duf.domain.Common;
import com.duniv.exdiary.domain.user.employee.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public class Company extends Common {
    @Id
    String companyId;
    String companyName;
    String corporateNumber;
    boolean confirmYn;


    @OneToMany(mappedBy = "company")
    List<Employee> employees;

    public Company(String companyId){
        this.companyId = companyId;
    }
}
