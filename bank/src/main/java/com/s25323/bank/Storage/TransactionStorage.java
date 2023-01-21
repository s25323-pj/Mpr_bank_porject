package com.s25323.bank.Storage;

import com.s25323.bank.Model.Transaction;
import com.s25323.bank.Model.User;

import java.util.ArrayList;
import java.util.List;

public class TransactionStorage {
    private final List<Transaction> transactionList = new ArrayList<>();

    public TransactionStorage() {
        transactionList.add(new Transaction("1", "Zlecenie przelewu", new User("123")));
        transactionList.add(new Transaction("2", "Wpłać pieniądze", new User("124")));
        transactionList.add(new Transaction("3", "Odczytaj dane klienta", new User("125")));
    }

    public Transaction findTransactionById(String transactionID) {
        for (Transaction transaction : transactionList) {
            if(transaction.getTransactionID().equals(transactionID));
            return transaction;
        }
    }
    public void addNewTransaction (Transaction transaction){
        transactionList.add(Transaction);
    }

    public List<Transaction> getTransactionList()}{
    return transactionList;
}
