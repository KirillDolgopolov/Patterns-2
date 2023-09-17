package org.example;

public class BolsaParis extends Observador {

    public BolsaParis(Nasdaq subject) {
        this.subject = subject;
        this.subject.argegarObservador(this);
    }

    @Override
    protected void actualizar() {
        System.out.println("Message form PRS: Puntos NASDAQ: " + this.subject.getEstado());
    }
}
