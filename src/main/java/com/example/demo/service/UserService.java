package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {
    UserDto.LoginResDto login(UserDto.LoginReqDto param);
    UserDto.CreateResDto signup(UserDto.CreateReqDto param);
    boolean id(String username);
    /**/
    UserDto.CreateResDto create(UserDto.CreateReqDto params);
    Map<String, Object> update(Map<String, Object> params);
    Map<String, Object> delete(Long id);
    List<User> list();
    User detail(Long id);
}