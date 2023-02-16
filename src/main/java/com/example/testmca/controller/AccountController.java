package com.example.testmca.controller;

import com.example.testmca.dto.CashAccountDto;
import com.example.testmca.service.AccountService;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("account")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("{accountId}")
    public CashAccountDto getCashAccount(@PathVariable("accountId") Long accountId) {
        return accountService.getCashAccount(accountId);
    }
}
