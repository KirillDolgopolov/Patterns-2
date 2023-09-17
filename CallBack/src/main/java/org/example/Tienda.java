package org.example;

import java.util.ArrayList;
import java.util.List;


public class Tienda {
    private List<Integer> visas;
    private List<Integer> payPal;
    private List<Integer> cuentaBanc;

    public Tienda() {
this.visas = new ArrayList<>();
this.payPal = new ArrayList<>();
this.cuentaBanc = new ArrayList<>();

    }

    public void doPayment (IPago pago){
        pago.processarPago();
        if (pago.getType().equalsIgnoreCase("visa")){
            visas.add(pago.getSum());
            System.out.println("Pago visa processado");
        } else if (pago.getType().equalsIgnoreCase("Paypal")){
            payPal.add(pago.getSum());
            System.out.println("Pago PayPal processado");
        } else if (pago.getType().equalsIgnoreCase("Cuenta")){
            cuentaBanc.add(pago.getSum());
            System.out.println("Pago bancario processado");
        } else System.out.println("Error of processing");

    }

    public void getBalance(){
        int sumVisas=visas.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Cuenta de Visas: "+sumVisas);

        int sumpayPal=payPal.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Cuenta de PayPal: "+sumpayPal);

        int sumBanc=cuentaBanc.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Cuenta de Visas: "+sumBanc);

        System.out.println("Suma total: "+(sumBanc+sumVisas+sumpayPal));
    }


}
