package com.duniv.exdiary.intrfc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

public class HumanService implements PickingWay{
    @Override
    public void getPicking(String name) {
        System.out.println("I am Human");
    }
}
