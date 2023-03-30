package com.duniv.exdiary.intrfc.controller;

import com.duniv.exdiary.domain.user.UserService;
import com.duniv.exdiary.intrfc.controller.vo.request.UserRegisterVO;
import com.duniv.exdiary.intrfc.service.UserCRUDService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/user")
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title = "유저 API"))
public class UserController {

    private final UserCRUDService userCRUDService;


    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity registerUser(@RequestBody UserRegisterVO vo) {
        //ResponseDataVO<BlogSearchResultDTO> result = service.searchBlog(keyword, page, sort);
        userCRUDService.registerUser(vo);
        return null;
        //return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
