package com.example.testmca.service;

import com.example.testmca.dto.TransferSummaryDto;
import com.example.testmca.exception.AmountException;
import com.example.testmca.exception.BadRequestException;
import com.example.testmca.exception.FabrikException;
import com.example.testmca.mapper.AccountMapper;
import com.example.testmca.model.Account;
import com.example.testmca.repository.MoneyTransferRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
@Log
public class MoneyTransferService {

    private AccountService accountService;
    private MoneyTransferRepository moneyTransferRepository;
    private AccountMapper accountMapper;

    @Autowired
    public MoneyTransferService(AccountService accountService, MoneyTransferRepository moneyTransferRepository, AccountMapper accountMapper) {
        this.accountService = accountService;
        this.moneyTransferRepository = moneyTransferRepository;
        this.accountMapper = accountMapper;
    }

    private void checkIfAmountIsEnough(Long accountId, String currency, String amount) {
        Account account = accountService.checkIfExistById(accountId);
        //TODO define where to take the current exchange rate from
        BigDecimal requestAmount = new BigDecimal(amount);
        if (account.getBalance().compareTo(requestAmount) < 0)
            new AmountException("code:API000, Errore tecnico La condizione BP049 non e' prevista per il conto id" + account.getAccountId());
    }

    private void checkData(String date) {
        final String regexDate = "^\\\\d{4}-\\\\d{2}-\\\\d{2}$";
        boolean b = date.matches(regexDate);
        if (!b)
            new BadRequestException("Date format is wrong");
        LocalDate localDate = LocalDate.parse(date);
        if (localDate.isAfter(LocalDate.now()))
            new BadRequestException("The date has passed");
    }

    public TransferSummaryDto sendMoney(Long accountId, String receiverName, String description, String currency, String amount, String executionDate) {
        checkIfAmountIsEnough(accountId, currency, amount);
        checkData(executionDate);
        //TODO Finire implementazione chiamando servizio di Fabrik e passando i parametri
        return null;
    }

    public List<TransferSummaryDto> getMoneyTransfer(Long accountId, String fromAccountingDate, String toAccountingDate) {
        Account account = accountService.checkIfExistById(accountId);
        //TODO Finire implementazione chiamando servizio di Fabrik e passando i parametri
        return null;
    }

    private String useAPIFabrik() {
        RestTemplate restTemplate = new RestTemplate();
        String baseUrl = "";
        return restTemplate
                .exchange(
                        baseUrl + "send-mail",
                        HttpMethod.POST,
                        getHttpWithHeaders(""),
                        String.class)
                .getBody();
    }

    private HttpEntity<String> getHttpWithHeaders(String body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Auth-Schema", "S2S");
        headers.set("Api-Key", "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
        return new HttpEntity<>(body, headers);
    }

}
