package com.duniv.exdiary.domain.employee;

import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@SuperBuilder
@NoArgsConstructor
public class EmployeeEntity extends Employee{
}
