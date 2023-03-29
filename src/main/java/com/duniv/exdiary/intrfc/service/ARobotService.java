package com.duniv.exdiary.intrfc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ARobotService implements PickingWay{
    @Override
    public void getPicking(String name) {
        System.out.println("I am Robot");
    }
}
