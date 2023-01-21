package com.s25323.bank.Storage;

import com.s25323.bank.Model.StatusType;
import com.s25323.bank.Model.Transaction;
import com.s25323.bank.Model.User;

import java.util.ArrayList;
import java.util.List;

public class TransactionStorage {
    private static final List<Transaction> transactionList = new ArrayList<>();

    public TransactionStorage() {
        transactionList.add(new Transaction("1", StatusType.ACCEPTED, "Zlecenie przelewu", new User("123")));
        transactionList.add(new Transaction("2", StatusType.ACCEPTED, "Wpłacenie pieniędzy", new User("124")));
        transactionList.add(new Transaction("3", StatusType.ACCEPTED, "Odczytaj dane", new User("125")));
    }

    public Transaction findTransactionById(String transactionID) {
        for (Transaction transaction : transactionList) {
            if (transaction.getTransactionID().equals(transactionID)) ;
            return transaction;
        }
        return null;
    }

    public void addNewTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public static List<Transaction> getTransactionList() {
        return transactionList;
    }
}