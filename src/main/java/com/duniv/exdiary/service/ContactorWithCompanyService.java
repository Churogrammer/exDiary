package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.company.CompanyRepository;
import com.duniv.exdiary.domain.company.CompanyService;
import com.duniv.exdiary.domain.contactor.ContactorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactorWithCompanyService {
    private final ContactorService contactorService;
    private final CompanyRepository companyRepository;
    //private final CompanyService companyService;
    // 담당자 ID에 회사 등록하기
    public void registerContactorCompany(String contactorId, String corporateNumber){
        //companyRepository.findBy
    }

    // 담당자 회사 등록 인증하기
    public void getValidateCompany(){

    }

    // 담당자 회사 등록 승인하기
    public void updateCompanyValidateComplete(){

    }
}
