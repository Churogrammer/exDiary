package com.duniv.exdiary.domain.company;

import com.querydsl.core.Tuple;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {
    private final CompanyRepository repository;
    private final CompanyRepositoryImpl companyRepositoryImpl;

    @Transactional
    public void saveCompany(int num){
       for(int i = 0 ; i < num ;i ++){
           CompanyDTO dto = new CompanyDTO("id_"+i,"회사_" + i , "c-"+i);
           repository.save(dto.toEntity());
       }
    }

    public List<Tuple> selectAllCompany(){
        return companyRepositoryImpl.selectAllCompany();
    }
    public void addNewCompany(CompanyDTO dto){

    }

    public void validateCompany(){

    }
}
