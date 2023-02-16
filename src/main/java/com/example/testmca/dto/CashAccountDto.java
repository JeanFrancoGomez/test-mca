package com.example.testmca.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class CashAccountDto {
    private LocalDate date;
    private BigDecimal balance;
    private BigDecimal availableBalance;
    private String currency;
}
