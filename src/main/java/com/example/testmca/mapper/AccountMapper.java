package com.example.testmca.mapper;

import com.example.testmca.dto.CashAccountDto;
import com.example.testmca.model.Account;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AccountMapper {
    CashAccountDto toDto(Account source);
}
