package com.duniv.exdiary.intrfc.controller;

import com.duniv.exdiary.intrfc.controller.employee.dto.request.EmployeeRegisterRequestDTO;
import com.duniv.exdiary.intrfc.service.TestService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

@RestController()
@RequestMapping("/test")
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title = "테스트 API"))
public class TestController {
    private final TestService service;

    @GetMapping(value = "/getTest", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getTest(String id) {
        service.makeException(id);
    }

    @ExceptionHandler(NullPointerException.class)
    public String throwException(Exception e){
        return "dtd";
    }
}
