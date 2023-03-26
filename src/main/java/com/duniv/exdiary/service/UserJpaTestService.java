package com.duniv.exdiary.service;

import com.duniv.exdiary.domain.user.UserEntity;
import com.duniv.exdiary.domain.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserJpaTestService {
    private final UserRepository repository;
    // 영속성 테스트하기

    // 1. getEntityList

    // 2. 트랜잭션이 없으면 영속성이 적용되지 않는다는게 진짜일까

    // 3. DTO로 리턴해도 영속성은 있다는데 이걸 모랐네

    //@Transactional
    public void noTransactional(String userPk, String userId, String nickName){
        // 1. 저장
        UserEntity first = UserEntity.builder().userPk(userPk).userId(userId).nickName(nickName).build();
        repository.save(first);
        System.out.println("[after first save] : " + first.getUserPk() + " / " + first.getUserId() + " / " + first.getNickName());

        // 2. 업데이트
        first.updateNickName("new chuchu");
        repository.save(first);
        System.out.println("[after update save] : " + first.getUserPk() + " / " + first.getUserId() + " / " + first.getNickName());

        // 3. 서버에서 pk로 값을 찾아오기
        UserEntity second = repository.findById(userPk).orElse(null);
        System.out.println("[after find] : " + second.getUserPk() + " / " + second.getUserId() + " / " + second.getNickName());
    }
    //@Transactional
    public void hasBuilderContext(String userPk, String userId, String nickName) {
        // entity Setting
        // builder에도 영속성이 포함될까?
        //UserEntity first = new UserEntity();
        UserEntity first = UserEntity.builder().userPk(userPk).userId(userId).nickName(nickName).build();
    }

    @Transactional
    public void getUserEntityList(){

        // 속성 set



        List<UserEntity> list = repository.findAll();



    }
}
