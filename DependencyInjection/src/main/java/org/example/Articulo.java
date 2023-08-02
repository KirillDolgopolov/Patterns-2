package org.example;

public class Articulo {
    private static int nextId = 1;
    private final int id;

    private String tipo;
    private String marca;
    private String model;
    private double price;

    public Articulo(String tipo, String marca, String model, double price) {
        this.tipo = tipo;
        this.marca = marca;
        this.model = model;
        this.price = price;
        this.id = nextId++;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
