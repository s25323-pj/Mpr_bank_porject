package com.s25323.bank.Model;

public class Transaction {

    private final String transactionID;
    private final User user;
    private StatusType status;

    public Transaction(String transactionID, User user, StatusType status){
    this.transactionID = transactionID;
    this.user = user;
    this.status = status;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", user=" + user +
                ", status=" + status +
                '}';
    }
}
