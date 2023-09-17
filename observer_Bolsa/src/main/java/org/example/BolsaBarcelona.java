package org.example;

public class BolsaBarcelona extends Observador{

    public BolsaBarcelona(Nasdaq subject) {
        this.subject=subject;
        this.subject.argegarObservador(this);
    }

    @Override
    protected void actualizar() {

        System.out.println("Message form BCN: Puntos NASDAQ: "+ this.subject.getEstado());

    }
}
