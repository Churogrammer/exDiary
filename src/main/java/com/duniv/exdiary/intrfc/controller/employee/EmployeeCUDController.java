package com.duniv.exdiary.intrfc.controller.employee;

import com.duniv.exdiary.domain.user.employee.EmployeeService;
import com.duniv.exdiary.intrfc.controller.employee.dto.request.EmployeeRegisterRequestDTO;
import com.duniv.exdiary.service.EmployeeRegisterService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/employee")
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title = "유저 API"))
public class EmployeeCUDController {
    private final EmployeeRegisterService registerService;
    private final EmployeeService employeeService;
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity registerEmployee(@RequestBody EmployeeRegisterRequestDTO vo) {
        registerService.registerEmployee(vo.toServiceDto());
        return null;
        //return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
