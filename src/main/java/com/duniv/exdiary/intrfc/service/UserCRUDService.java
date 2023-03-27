package com.duniv.exdiary.intrfc.service;

import com.duniv.exdiary.domain.user.UserEntity;
import com.duniv.exdiary.domain.user.UserService;
import com.duniv.exdiary.intrfc.controller.vo.request.UserRegisterVO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserCRUDService {
    private final UserService userService;
    public void registerUser(UserRegisterVO vo) {
        // 데이터 검증

        UserEntity entity = new UserEntity("userPk", vo.getUserId(), vo.getUserName(), vo.getUserType(), vo.getEmail(), vo.getTelNumber(), vo.getPhoneNumber());
    }
}
