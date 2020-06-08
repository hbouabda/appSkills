package com.skills.accountservice.controller;

import com.skills.accountservice.dto.UserDto;
import com.skills.accountservice.dto.UserRegistrationDto;
import com.skills.accountservice.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
        return accountService.create(user);
    }

    @GetMapping
    public List<UserDto> getAccounts(){
        return accountService.getAccounts();
    }

}
