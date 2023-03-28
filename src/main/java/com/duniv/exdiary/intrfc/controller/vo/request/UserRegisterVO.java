package com.duniv.exdiary.intrfc.controller.vo.request;

import com.duniv.duf.domain.tools.StringTools;
import lombok.Getter;

@Getter
public class UserRegisterVO {
    String userId;
    String userName;
    String userType;
    String email;
    String telNumber;
    String phoneNumber;

    public boolean validateRequired(){
        if(StringTools.isEmpty(userId) || StringTools.isEmpty(userName) ||
                StringTools.isEmpty(email) || StringTools.isEmpty(telNumber)){
                return false;
        }
        return true;
    }
}
