package com.mycompany.lab9;

public class Cosmetice 
{
    private String denumire;
    private String producator;
    private double pret;

    public Cosmetice(String denumire, String producator, double pret) {
        this.denumire = denumire;
        this.producator = producator;
        this.pret = pret;
    }

    public void afiseaza() {
        System.out.println("Denumire: " + denumire + ", Producator: " + producator + ", Pret: " + pret + " RON");
    }
}
