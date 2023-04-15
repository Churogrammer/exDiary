package com.duniv.exdiary.domain.user.employee;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@SuperBuilder
@NoArgsConstructor
public class EmployeeEntity extends Employee{
}
