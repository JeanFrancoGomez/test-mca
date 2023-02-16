package com.example.testmca.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataEraserJob {

  @Scheduled(cron = "${job.delete-data}", zone = "Europe/Rome")
  public void eraseData() {
  }
}
