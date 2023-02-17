package com.example.testmca.controller;

import com.example.testmca.dto.TransferSummaryDto;
import com.example.testmca.service.MoneyTransferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("transfer")
@CrossOrigin(origins = "*")
public class MoneyTransferController {

    @Autowired
    private MoneyTransferService moneyTransferService;

    @PostMapping
    public TransferSummaryDto sendMoney(
            @RequestParam("accountId") Long accountId,
            @RequestParam("receiverName") String receiverName,
            @RequestParam("description") String description,
            @RequestParam("currency") String currency,
            @RequestParam("amount") String amount,
            @RequestParam("executionDate") String executionDate
    ) {
        return moneyTransferService.sendMoney(accountId, receiverName, description, currency, amount, executionDate);
    }

    @GetMapping
    public List<TransferSummaryDto> getMoneyTransfer(
            @RequestParam("accountId") Long accountId,
            @RequestParam("fromAccountingDate") String fromAccountingDate,
            @RequestParam("toAccountingDate") String toAccountingDate
    ) {
        return moneyTransferService.getMoneyTransfer(accountId, fromAccountingDate, toAccountingDate);
    }
}
