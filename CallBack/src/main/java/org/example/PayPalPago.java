package org.example;

public class PayPalPago implements IPago {

    int suma;
    public final String type;

    public PayPalPago() {
        this.suma = 0;
        this.type = "PayPal";
    }

    public int getSum() {
        return suma;
    }

    @Override
    public void setSuma(int euros) {
        suma = euros;
    }

    public String getType() {
        return type;
    }

    @Override
    public void processarPago() {

        System.out.println("Pago por PayPal €" + suma);
    }
}
