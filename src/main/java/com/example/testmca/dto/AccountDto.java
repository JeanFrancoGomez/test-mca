package com.example.testmca.dto;

import com.example.testmca.model.CustomerBank;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountDto {
    private Long accountId;
    private String iban;
    private Long abiCode;
    private Long cabCode;
    private String countryCode;
    private Integer internationalCin;
    private String nationalCin;
    private Long account;
    private String alias;
    private String productName;
    private String holderName;
    private LocalDate activatedDate;
    private BigDecimal balance;
    private BigDecimal availableBalance;
    private String currency;
    private CustomerBankDto customerBankDto;
}
