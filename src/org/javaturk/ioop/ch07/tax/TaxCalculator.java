package org.javaturk.ioop.ch07.tax;

public class TaxCalculator {
    public double calculateTax(double price) {
        return price * Tax.VAT_RATE;
    }
}
