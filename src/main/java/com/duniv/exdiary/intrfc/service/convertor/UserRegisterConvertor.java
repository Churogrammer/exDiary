package com.duniv.exdiary.intrfc.service.convertor;

import com.duniv.exdiary.domain.user.UserEntity;
import com.duniv.exdiary.intrfc.controller.vo.request.UserRegisterVO;
import org.springframework.stereotype.Component;

@Component
public class UserRegisterConvertor {

    public UserEntity convRegisterVO(UserRegisterVO vo) {
        UserEntity entity = new UserEntity();
        // 해당 Id가 존재하면 update
        return entity;
    }
}
