package org.example;

public class CuentaBancariaPago implements IPago {

    int suma;
    public String type;

    public CuentaBancariaPago() {

        this.suma = 0;
        this.type = "Cuenta";
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

        System.out.println("Pago por transferencia bancaria €" + suma);
    }
}
