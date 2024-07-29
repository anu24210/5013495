package com.example.strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

       
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/24");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(250.0);

        System.out.println();

        
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(150.0);
    }
}