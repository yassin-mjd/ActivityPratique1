package org.sid.demo;

import org.sid.demo.entities.BankAccount;
import org.sid.demo.enums.AccountType;
import org.sid.demo.repositories.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
  	@Bean
	CommandLineRunner start(BankAccountRepository BankAccountRepository) {
		return args -> {
			for (int i = 0; i < 10; i++) {
				BankAccount bankAccount = BankAccount.builder()
						.id(UUID.randomUUID().toString())
						.type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
						.balance(10000+Math.random()*90000)
						.createdat(new Date())
						.currency("DH")
						.build();
				BankAccountRepository.save(bankAccount);
			}
		};

	}
}
