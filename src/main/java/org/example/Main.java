package org.example;

public class Main {
    public static void main(String[] args) {
        Coche cocheBarbie = new Coche("Audi", "A5", 2019);

        System.out.println(cocheBarbie.mostrarInformacion());

        cocheBarbie.conducir(20.5);
        System.out.println(cocheBarbie.mostrarInformacion());
    }
}
