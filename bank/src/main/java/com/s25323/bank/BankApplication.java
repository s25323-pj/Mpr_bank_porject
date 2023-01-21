package com.s25323.bank;

import com.s25323.bank.Storage.TransactionStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	public BankApplication(TransactionService transactionService, TransactionStorage transactionStorage){}

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
