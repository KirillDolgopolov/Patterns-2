package org.example;

public class Main {
    public static void main(String[] args) {

        Articulo art1 = new Articulo("TV", "Samsung", "TV-80001 Smart", 2999);
        Articulo art2 = new Articulo("Bolso", "Louis Vuitton", "La vista de la luna", 8000);
        Articulo art3 = new Articulo("Fruta", "Tenerife Fruit Company", "Banana", 0.6);

        CurrencyConverter converter = new CurrencyConverter();
        converter.setGbp(0.8582);

        ShowInfo showInfo = new ShowInfo();

        showInfo.showInfoAndPrice(art1, converter);
        showInfo.showInfoAndPrice(art2, converter);
        showInfo.showInfoAndPrice(art3, converter);

        converter.setGbp(1.9582);

        showInfo.showInfoAndPrice(art1, converter);
        showInfo.showInfoAndPrice(art2, converter);
        showInfo.showInfoAndPrice(art3, converter);
    }
}