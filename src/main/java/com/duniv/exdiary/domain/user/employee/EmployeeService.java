package com.duniv.exdiary.domain.user.employee;

import com.duniv.exdiary.intrfc.service.convertor.MappingEmployeeDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final MappingEmployeeDTO mappingManager;
    private final EmployeeRepository repository;

    public boolean validateIdAvailability(String loginId){
        return repository.findByLoginId(loginId) == null ? true : false;
    }

    public void registerEmployee(EmployeeRegisterDTO dto){
        Employee entity = mappingManager.registerEmployee(dto);
        repository.save(entity);
    }

    public Employee getEmployeeByUserId(Integer userId) {
        return repository.findByUserId(userId).orElseThrow();
    }
}
