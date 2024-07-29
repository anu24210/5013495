package com.example.observerpattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("App1");
        Observer mobileApp2 = new MobileApp("App2");
        Observer webApp1 = new WebApp("Web1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        System.out.println("Setting price to 100.0");
        stockMarket.setPrice(100.0);
        System.out.println();

        stockMarket.removeObserver(mobileApp1);

        System.out.println("Setting price to 200.0");
        stockMarket.setPrice(200.0);
    }
}
