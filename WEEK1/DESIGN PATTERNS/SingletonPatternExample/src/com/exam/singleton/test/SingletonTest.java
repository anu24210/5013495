package com.exam.singleton.test;

import com.example.singleton.*;

public class SingletonTest {

	public static void main(String[] args) {
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
	
	
	if(logger1==logger2) {
		System.out.println("Both the Logger1 and Logger2 are same instances");
	}
	else {
		System.out.println("Both Logger1 and Logger2 are different instances");
	}
	
	logger1.log("This is a log message.");
	}

}
