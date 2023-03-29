package com.duniv.exdiary.intrfc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class TestService {
    private final PickingWay pickingWay;
    //private final StringRedisTemplate redisTemplate;

    public void getPickingWay(String str) {
        pickingWay.getPicking(str);
    }

}
