package com.example.test;
import com.example.adapter.*;
public class TestAdapterPattern {

	 public static void main(String[] args) {
	        
	        PayPal payPal = new PayPal();
	        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
	        payPalAdapter.processPayment(100.0);

	        
	        Stripe stripe = new Stripe();
	        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
	        stripeAdapter.processPayment(200.0);

	       
	        Square square = new Square();
	        PaymentProcessor squareAdapter = new SquareAdapter(square);
	        squareAdapter.processPayment(300.0);
	    }
}
