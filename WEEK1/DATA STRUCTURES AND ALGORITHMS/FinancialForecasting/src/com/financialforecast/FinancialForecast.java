package com.financialforecast;

public class FinancialForecast {
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return predictFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05;
        int years = 10;
        double futureValue = predictFutureValue(presentValue, growthRate, years);
        System.out.println("Predicted future value: " + futureValue);
    }
}
