package com.duniv.exdiary.domain.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public void registerUser(){


    }

    public UserEntity getUserByUserId(String userId){
        // 내부에서 userId 존재하는지 확인하기
        return repository.findByUserId(userId);
    }

    public void getUserList(){

    }
}
