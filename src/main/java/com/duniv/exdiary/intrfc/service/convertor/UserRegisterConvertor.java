package com.duniv.exdiary.intrfc.service.convertor;

import com.duniv.exdiary.domain.user.UserEntity;
import com.duniv.exdiary.intrfc.controller.dto.request.EmployeeRegisterRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterConvertor {

    public UserEntity convRegisterVO(EmployeeRegisterRequestDTO vo) {
        UserEntity entity = new UserEntity();
        // 해당 Id가 존재하면 update
        return entity;
    }
}
