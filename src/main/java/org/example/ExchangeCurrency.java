package org.example;

public class ExchangeCurrency extends getNumbers{
    public double exchangeCurr(double a, double b){
        double ex = a * b;
        return Math.round(ex*100.0)/100.0;
    }
}
