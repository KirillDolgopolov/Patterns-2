package org.example;

public class Main {
    public static void main(String[] args) {

        Tienda zapatosMario = new Tienda();


        IPago visaPay = new VisaPago();
        IPago payPal = new PayPalPago();
        IPago banco = new CuentaBancariaPago();


        banco.setSuma(259999);
        zapatosMario.doPayment(banco);

        payPal.setSuma(115);
        zapatosMario.doPayment(payPal);

        visaPay.setSuma(33);
        zapatosMario.doPayment(visaPay);
        zapatosMario.doPayment(visaPay);

        System.out.println();
        zapatosMario.getBalance();
    }
}