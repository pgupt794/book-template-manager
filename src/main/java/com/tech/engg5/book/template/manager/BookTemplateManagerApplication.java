package com.tech.engg5.book.template.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.tools.agent.ReactorDebugAgent;

@SpringBootApplication
public class BookTemplateManagerApplication {
  public static void main(String[] args) {
    ReactorDebugAgent.init();
    System.setProperty("APP_ID", "1000151");
    System.setProperty("APP_NAME", "book-template-manager");
    SpringApplication application = new SpringApplication(BookTemplateManagerApplication.class);
    application.run(args);
  }
}
