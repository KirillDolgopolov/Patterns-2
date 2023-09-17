package org.example;

public class Main {
    public static void main(String[] args) {
        Nasdaq theNDQ = new Nasdaq();



        BolsaBarcelona bolsa1 = new BolsaBarcelona(theNDQ);
        BolsaParis bolsa2 = new BolsaParis(theNDQ);
        BolsaBerlin bolsa3 = new BolsaBerlin(theNDQ);

        theNDQ.setEstado(436);

    }
}