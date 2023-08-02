package org.example;

public class Main {
    public static void main(String[] args) {

        Tienda zapatosMario = new Tienda();


        IPago visaPay = new IPago() {

            int suma = 0;
            public String type = "Visa";

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
        };


        IPago payPal = new IPago() {
            int suma = 0;
            public String type = "PayPal";

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
        };


        IPago banco = new IPago() {
            int suma = 0;
            public String type = "Cuenta";

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
        };

        banco.setSuma(259999);
        zapatosMario.doPayment(banco);

        payPal.setSuma(115);
        zapatosMario.doPayment(payPal);

        visaPay.setSuma(33);
        zapatosMario.doPayment(visaPay);

        System.out.println();
        zapatosMario.getBalance();
    }
}