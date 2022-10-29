package com.lucasfariassa.divideconta;

public class Bill {
    private int totalAmount, participants;

    public Bill(int totalAmount, int participants) {
        this.totalAmount = totalAmount;
        this.participants = participants;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}
