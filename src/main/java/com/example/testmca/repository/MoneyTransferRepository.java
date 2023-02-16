package com.example.testmca.repository;

import com.example.testmca.model.Account;
import com.example.testmca.model.MoneyTransfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoneyTransferRepository extends JpaRepository<MoneyTransfer, Integer> {
}
