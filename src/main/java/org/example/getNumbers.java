package org.example;
import java.util.Scanner;

public class getNumbers {
    public int getEuros(){
        System.out.println("How many euros are you exchanging? ");
        Scanner euro = new Scanner(System.in);
        return euro.nextInt();
    }
    public double getExchangeRate(){
        System.out.println("What is the exchange rate? ");
        Scanner ex = new Scanner(System.in);
        double rate = ex.nextDouble();
        return rate;
    }
}
