package com.example.testmca.service;

import com.example.testmca.dto.CashAccountDto;
import com.example.testmca.exception.NotFoundException;
import com.example.testmca.mapper.AccountMapper;
import com.example.testmca.model.Account;
import com.example.testmca.repository.AccountRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Log
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountMapper accountMapper;

    public Account checkIfExistById(Long accountId) {
        return accountRepository.findById(accountId).orElseThrow(
                () -> new NotFoundException("Account is not found")
        );
    }

    public CashAccountDto getCashAccount(Long accountId) {
        return accountMapper.toDto(checkIfExistById(accountId));
    }
}
