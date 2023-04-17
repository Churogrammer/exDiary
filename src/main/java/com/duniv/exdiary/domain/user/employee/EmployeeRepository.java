package com.duniv.exdiary.domain.user.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByLoginId(String loginId);
    public Employee save(Employee entity);

    public Optional<Employee> findByUserId(Integer userId);
}
