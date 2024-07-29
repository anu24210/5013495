package com.example.observerpattern;

public interface Stock {
	    void registerObserver(Observer o);
	    void removeObserver(Observer o);
	    void notifyObservers();
}
