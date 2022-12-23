package com.winterdevcamp.authentication.user;

import com.winterdevcamp.authentication.user.dto.SignUpReqDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @PostMapping("")
    public void signUp(@RequestBody SignUpReqDto signUpReqDto) {
        userService.signUp(signUpReqDto);
    }
}