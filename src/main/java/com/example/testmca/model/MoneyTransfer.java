package com.example.testmca.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MoneyTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Long creditor;

    @Column(nullable = false)
    private Long debtor;

    @Column
    private LocalDateTime executionDate;

    @Column
    private String uri;

    @Column
    private String description;

    @Column
    private BigDecimal amount;

    @Column(nullable = false, length = 3)
    private String currency;

    @Column
    private Boolean isUrgent;

    @Column
    private Boolean isInstant;

    @Column
    private String feeType;

    @Column
    private Long feeAccountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyTransfer that = (MoneyTransfer) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
