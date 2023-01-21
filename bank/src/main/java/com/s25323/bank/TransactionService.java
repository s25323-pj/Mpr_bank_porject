package com.s25323.bank;

import com.s25323.bank.Model.StatusType;
import com.s25323.bank.Model.Transaction;
import com.s25323.bank.Model.User;
import com.s25323.bank.Storage.TransactionStorage;

import java.util.List;

public class TransactionService {
    private final TransactionService transactionService;

    public TransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    public List<Transaction> getAllTransactions(){
        return TransactionStorage.getTransactionList();
    }
    public <transactionID> Transaction createTransaction (String transactionID, StatusType status, User user){

    }
}
