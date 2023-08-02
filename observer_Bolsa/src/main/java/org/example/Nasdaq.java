package org.example;

import java.util.ArrayList;
import java.util.List;

public class Nasdaq {

    private List<Observador> observadores = new ArrayList<Observador>();
    private int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
        actualizarObservadores();
    }

    public void argegarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void actualizarObservadores() {
        observadores.forEach(x -> x.actualizar());
    }

}