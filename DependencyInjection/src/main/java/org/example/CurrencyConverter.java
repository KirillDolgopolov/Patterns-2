package org.example;

import java.text.DecimalFormat;

public class CurrencyConverter {

    private double usd = 1.01;
    private double gbp = 0.8583;
    private double monopolyCredit = 295634594549.26598;

    public CurrencyConverter() {
    }

    public double getUsd() {
        return usd;
    }

    public void setUsd(double usd) {
        this.usd = usd;
    }

    public double getGbp() {
        return gbp;
    }

    public void setGbp(double gbp) {
        this.gbp = gbp;
    }

    public double getMonopolyCredit() {
        return monopolyCredit;
    }

    public void setMonopolyCredit(double monopolyCredit) {
        this.monopolyCredit = monopolyCredit;
    }

    public void showPrice(Articulo articulo) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("El precio:");
        System.out.println("Euro: " + df.format(articulo.getPrice()));
        System.out.println("Dollar EE.UU.: " + df.format(articulo.getPrice() * this.usd));
        System.out.println("Pound R.U.: " + df.format(articulo.getPrice() * this.gbp));
        System.out.println("Dinero de juego de mesa 'Monopolia': " + df.format(articulo.getPrice() * this.monopolyCredit));
        System.out.println();
        System.out.println();
    }


}
