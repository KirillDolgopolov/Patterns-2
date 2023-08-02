package org.example;

public class ShowInfo {

    public void showInfoAndPrice(Articulo articulo, CurrencyConverter converter) {
        System.out.println("Tipo de producto: " + articulo.getTipo());
        System.out.println("ID: " + articulo.getId());
        System.out.println("Marca: " + articulo.getMarca());
        System.out.println("Model: " + articulo.getModel());
        System.out.println();
        converter.showPrice(articulo);
    }
}
