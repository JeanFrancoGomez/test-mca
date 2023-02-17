package com.example.testmca.mapper;

import com.example.testmca.dto.AddressDto;
import com.example.testmca.dto.CustomerBankDto;
import com.example.testmca.model.Address;
import com.example.testmca.model.CustomerBank;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface CustomerBankMapper {
    CustomerBankDto toDto(CustomerBank source);
}
