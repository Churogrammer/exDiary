package com.duniv.exdiary.intrfc.service;

import com.duniv.exdiary.domain.user.UserEntity;
import com.duniv.exdiary.domain.user.UserService;
import com.duniv.exdiary.intrfc.controller.vo.request.UserRegisterVO;
import com.duniv.exdiary.intrfc.service.convertor.UserRegisterConvertor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserCRUDService {
    private final UserRegisterConvertor convertor;
    private final UserService userService;
    public void registerUser(UserRegisterVO vo) {
        // 데이터 검증
        if(vo.validateRequired()){
            // 필수값 미완료
        }

        
        // PK 자동생성
        // ID 검사 -> ID를 메모리로 가지고 있을까?
        userService.getUserByUserId(vo.getUserId());
        // 데이터 컨버팅
        //UserEntity entity = new UserEntity("userPk", vo.getUserId(), vo.getUserName(), vo.getUserType(), vo.getEmail(), vo.getTelNumber(), vo.getPhoneNumber());
    }
}
