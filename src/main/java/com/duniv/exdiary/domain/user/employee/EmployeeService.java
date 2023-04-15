package com.duniv.exdiary.domain.employee;

import com.duniv.exdiary.domain.company.CompanyEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final MappingEmployeeDTO mappingManager;
    private final EmployeeRepository repository;

    public boolean validateIdAvailability(String loginId){
        return repository.findByEmployeeLoginId(loginId) == null ? true : false;
    }

    public void registerEmployee(EmployeeRegisterDTO dto){
        EmployeeEntity entity = mappingManager.registerEmployee(dto);
        entity.registerYn();
        repository.save(entity);
    }

    public EmployeeEntity findById(Integer employeeId) {
        return repository.findById(employeeId).orElse(null);
    }
}