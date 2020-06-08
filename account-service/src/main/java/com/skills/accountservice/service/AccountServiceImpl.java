package com.skills.accountservice.service;

import com.skills.accountservice.client.AuthServiceFeignClient;
import com.skills.accountservice.dto.UserDto;
import com.skills.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }

    @Override
    public List<UserDto> getAccounts() {
        return authServiceFeignClient.getAccount();
    }
}
