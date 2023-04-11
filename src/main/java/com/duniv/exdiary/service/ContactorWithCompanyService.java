package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.CompanyDTO;
import com.duniv.exdiary.domain.company.CompanyEntity;
import com.duniv.exdiary.domain.company.CompanyRepository;
import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.domain.contactor.ContactorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class ContactorWithCompanyService {
    private final ContactorService contactorService;
    private final CompanyService companyService;

    @Transactional
    public void requestInitCompany(){
        // 등록 employee Id
        // 필요 서류 첨부
    }

    // 회사 최초 등록
    public void initCompany(){
        // 담당자 employeeId 조회 및 담당자 지정
        // 사업자 번호 등록

    }

    // 담당자 회사 등록 인증하기
    // init은 제외
    public void getValidateCompany(){

    }

    // 담당자 회사 등록 승인하기
    public void updateCompanyValidateComplete(){

    }
}
