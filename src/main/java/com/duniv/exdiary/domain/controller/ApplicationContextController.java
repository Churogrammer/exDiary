package com.duniv.exdiary.domain.controller;

import com.duniv.exdiary.service.UserJpaTestService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/applicationContext")
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title = "영속성 접속 API"))
public class ApplicationContextController {
    private final UserJpaTestService service;
    @GetMapping(value = "/noTransactional", produces = MediaType.APPLICATION_JSON_VALUE)
    public void noTransactional(){
        service.noTransactional("user01", "userId","chuchu");
    }
}
