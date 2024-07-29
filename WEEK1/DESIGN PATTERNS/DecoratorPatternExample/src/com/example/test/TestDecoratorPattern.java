package com.example.test;
import com.example.decorator.*;
public class TestDecoratorPattern {

	 public static void main(String[] args) {
	        
	        Notifier emailNotifier = new EmailNotifier();
	        emailNotifier.send("GOOD MORNING!");

	        
	        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
	        smsNotifier.send("GOOD AFTERNOON!");

	        
	        Notifier slackNotifier = new SlackNotifierDecorator(new EmailNotifier());
	        slackNotifier.send("GOOD EVENING!");

	        
	        Notifier combinedNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
	        combinedNotifier.send("GOOD NIGHT!");
	    }

}
