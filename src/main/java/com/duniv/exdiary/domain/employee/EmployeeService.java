package com.duniv.exdiary.domain.employee;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
}
