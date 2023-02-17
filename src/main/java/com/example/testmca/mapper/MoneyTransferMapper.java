package com.example.testmca.mapper;

import com.example.testmca.dto.CustomerBankDto;
import com.example.testmca.dto.TransferSummaryDto;
import com.example.testmca.model.CustomerBank;
import com.example.testmca.model.MoneyTransfer;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface MoneyTransferMapper {
    TransferSummaryDto toDto(MoneyTransfer source);
}
