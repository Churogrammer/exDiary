package com.duniv.exdiary.intrfc.controller.company;

import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.intrfc.controller.company.dto.CompanyRegisterDTO;
import com.duniv.exdiary.intrfc.controller.employee.dto.request.EmployeeRegisterRequestDTO;
import com.duniv.exdiary.service.CompanyRegisterService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/company")
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title = "회사 API"))
public class CompanyController {
    private final CompanyRegisterService companyRegisterService;

    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public void searchCompany(String name){
        //companyService.
    }
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity register(@RequestBody CompanyRegisterDTO dto) {
        companyRegisterService.initCompany(dto);
        return null;
        //return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @Operation(description = "기업 인증 현황")
    @GetMapping(value = "/certify/step", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getCertificationStep(String companyId) {
        return null;
        //return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Operation(description = "인증 문서 가져오기")
    @GetMapping(value = "/document", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getDocument(String companyId) {
        return null;
        //return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @Operation(description = "인증 문서 등록하기")
    @PostMapping(value = "/document", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity uploadDocument(String companyId) {
        return null;
        //return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
