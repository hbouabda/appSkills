package com.skills.authservice.service;

import com.skills.authservice.domain.User;
import com.skills.authservice.dto.UserDto;
import com.skills.authservice.dto.UserRegistrationDto;

import java.util.List;

public interface UserService {
    UserDto create(UserRegistrationDto user);

    List<UserDto> getUsers();
}
