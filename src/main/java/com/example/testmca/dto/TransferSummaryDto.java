package com.example.testmca.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransferSummaryDto {
    private Long moneyTransferId;
    private String status;
    private AccountDto accountDto;
    private CustomerDto customerDto;

    //"moneyTransferId": "452516859427",
    //  "status": "EXECUTED",
    //  "direction": "OUTGOING",
    //  "creditor": {
    //    "name": "John Doe",
    //    "account": {
    //      "accountCode": "IT23A0336844430152923804660",
    //      "bicCode": "SELBIT2BXXX"
    //    },
    //    "address": {
    //      "address": null,
    //      "city": null,
    //      "countryCode": null
    //    }
    //  },
    //  "debtor": {
    //    "name": "",
    //    "account": {
    //      "accountCode": "IT61F0326802230280596327270",
    //      "bicCode": null
    //    }
    //  },
    //  "cro": "1234566788907",
    //  "uri": "REMITTANCE_INFORMATION",
    //  "trn": "AJFSAD1234566788907CCSFDGTGVGV",
    //  "description": "Description",
    //  "createdDatetime": "2019-04-10T10:38:55.949+0200",
    //  "accountedDatetime": "2019-04-10T10:38:56.000+0200",
    //  "debtorValueDate": "2019-04-10",
    //  "creditorValueDate": "2019-04-10",
    //  "amount": {
    //    "debtorAmount": 800,
    //    "debtorCurrency": "EUR",
    //    "creditorAmount": 800,
    //    "creditorCurrency": "EUR",
    //    "creditorCurrencyDate": "2019-04-10",
    //    "exchangeRate": 1
    //  },
    //  "isUrgent": false,
    //  "isInstant": false,
    //  "feeType": "SHA",
    //  "feeAccountId": "12345678",
    //  "fees": [
    //    {
    //      "feeCode": "MK001",
    //      "description": "Money transfer execution fee",
    //      "amount": 0.25,
    //      "currency": "EUR"
    //    },
    //    {
    //      "feeCode": "MK003",
    //      "description": "Currency exchange fee",
    //      "amount": 3.5,
    //      "currency": "EUR"
    //    }
    //  ],
    //  "hasTaxRelief": true
}
