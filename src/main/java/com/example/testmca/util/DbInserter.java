package com.example.testmca.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DbInserter {
  @Autowired private FakerGenerator faker;

}
