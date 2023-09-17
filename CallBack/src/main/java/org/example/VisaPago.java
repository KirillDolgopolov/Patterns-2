package org.example;

public class VisaPago implements IPago{
    int suma;
    public final String type;


    public VisaPago() {
        this.suma=0;
        type = "Visa";
    }

    
    
    public void setSuma(int euros) {
        suma = euros;
    }

    public int getSum() {
        return suma;
    }

    public String getType() {
        return type;
    }

    @Override
    public void processarPago() {

        System.out.println("Pago por visa €" + suma);
    }
}
