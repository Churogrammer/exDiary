package com.duniv.exdiary.intrfc.service;

import com.duniv.exdiary.domain.company.CompanyEntity;
import com.duniv.exdiary.domain.company.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class TestService {
    //private final PickingWay pickingWay;
    //private final StringRedisTemplate redisTemplate;

    private final CompanyRepository repository;

    @Transactional
    public void hasListEntity(){
        repository.findAll();
        repository.findAll();
        repository.findAll();
        System.out.println("----------------- findByAllId");

        String[] arr = new String[]{"id_0","id_1"};
        List<String> list = new ArrayList<String>();
        list.add("id_0");
        list.add("id_1");

       // repository.findAllById(list);
       // repository.findAllById(list);
       // repository.findAllById(list);

        System.out.println("----------------- findById");

        repository.findById("id_0");
        repository.findById("id_0");
        repository.findById("id_0");

    }

    @Transactional
    public void hasRowEntity(){
        repository.findById("id_0");
        repository.findById("id_0");
        repository.findById("id_0");
        repository.findById("id_0");
    }

}
