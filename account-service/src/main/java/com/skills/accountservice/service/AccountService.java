package com.skills.accountservice.service;

import com.skills.accountservice.dto.UserDto;
import com.skills.accountservice.dto.UserRegistrationDto;

import java.util.List;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);

    List<UserDto> getAccounts();
}
