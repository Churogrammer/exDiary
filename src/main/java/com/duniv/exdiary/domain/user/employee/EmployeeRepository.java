package com.duniv.exdiary.domain.user.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

    public EmployeeEntity findByEmployeeLoginId(String loginId);
    public EmployeeEntity save(EmployeeEntity entity);
}
