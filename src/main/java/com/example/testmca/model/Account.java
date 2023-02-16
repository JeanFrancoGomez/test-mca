package com.example.testmca.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(nullable = false)
    private String iban;

    @Column
    private Long abiCode;
    @Column
    private Long cabCode;

    @Column(nullable = false, length = 2, columnDefinition = "IT")
    private String countryCode;

    private Integer internationalCin;

    @Column(nullable = false, length = 1)
    private String nationalCin;

    @Column
    private Long account;

    @Column
    private String alias;

    @Column
    private String productName;

    @Column
    private String holderName;

    @Column
    private LocalDate activatedDate;

    @Column
    private BigDecimal balance;

    @Column
    private BigDecimal availableBalance;

    @Column(nullable = false, length = 3, columnDefinition = "EUR")
    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountId, account.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }
}
