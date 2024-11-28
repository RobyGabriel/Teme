package com.mycompany.lab9;

class Sampon extends Cosmetice {
    private String tipPar;

    public Sampon(String denumire, String producator, double pret, String tipPar) {
        super(denumire, producator, pret);
        this.tipPar = tipPar;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Tip par: " + tipPar);
    }
}
