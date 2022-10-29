package com.lucasfariassa.divideconta;

public class Calculator {

    public static double calculateValue(double totalAmount, int participants) {
        double result;
        result = totalAmount / participants;
        return result;
    }
}
