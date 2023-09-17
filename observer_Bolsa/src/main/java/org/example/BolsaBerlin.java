package org.example;

public class BolsaBerlin extends Observador {

    public BolsaBerlin(Nasdaq subject) {
        this.subject = subject;
        this.subject.argegarObservador(this);
    }

    @Override
    protected void actualizar() {
        System.out.println("Message form BRL: Puntos NASDAQ: " + this.subject.getEstado());
    }
}
