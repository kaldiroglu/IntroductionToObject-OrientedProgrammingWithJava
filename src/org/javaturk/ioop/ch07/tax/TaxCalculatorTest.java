package org.javaturk.ioop.ch07.tax;

public class TaxCalculatorTest {
    void main(){
        TaxCalculator tc = new TaxCalculator();
        double price = 1250;
        double tax = tc.calculateTax(price);
        System.out.println("Tax of " + price + " is " + tax);
    }
}
