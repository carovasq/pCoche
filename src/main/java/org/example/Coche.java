package org.example;

public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = 0;
    }

    public void conducir(double km){
        if (km > 0) {
            this.kilometraje += km;
        } else {
            System.out.println("El kilometraje no puede ser negativo.");
        }
    }

    public String mostrarInformacion() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
