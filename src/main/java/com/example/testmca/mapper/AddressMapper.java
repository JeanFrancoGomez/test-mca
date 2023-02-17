package com.example.testmca.mapper;

import com.example.testmca.dto.AddressDto;
import com.example.testmca.dto.CashAccountDto;
import com.example.testmca.model.Account;
import com.example.testmca.model.Address;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDto toDto(Address source);
}
