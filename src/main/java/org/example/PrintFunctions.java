package org.example;

public class PrintFunctions extends ExchangeCurrency{
    public void printF(){
        ExchangeCurrency c = new ExchangeCurrency();
        int c_from = c.getEuros();
        double rate = c.getExchangeRate();
        double exchangeC = c.exchangeCurr(c_from, rate);
        System.out.println(c_from + " euros at an exchange rate of " + rate + " is " + exchangeC + " US dollars");
    }
}
