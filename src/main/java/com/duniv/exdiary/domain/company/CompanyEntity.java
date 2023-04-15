package com.duniv.exdiary.domain.company;


import com.duniv.exdiary.domain.user.employee.EmployeeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
public class CompanyEntity extends Company{

    @OneToMany(mappedBy = "company")
    List<EmployeeEntity> employees;

    public CompanyEntity(String companyId){
        super(companyId);
    }
}
