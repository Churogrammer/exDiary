package com.duniv.exdiary.domain.user.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByEmployeeLoginId(String loginId);
    public Employee save(Employee entity);
}
