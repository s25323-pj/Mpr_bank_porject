package com.s25323.bank;

import com.s25323.bank.Storage.TransactionStorage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class BankApplicationTests {

	@Test
	void contextLoads() {
	}
	@MockBean
	private TransactionStorage transactionStorage;

	@Autowired
	private TransactionService transactionService;
	@Test


}
