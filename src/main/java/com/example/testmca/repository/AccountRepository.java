package com.example.testmca.repository;

import com.example.testmca.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
