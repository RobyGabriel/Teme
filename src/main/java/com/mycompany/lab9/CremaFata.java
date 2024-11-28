package com.mycompany.lab9;

class CremaFata extends Cosmetice {
    private String tipTen;

    public CremaFata(String denumire, String producator, double pret, String tipTen) {
        super(denumire, producator, pret);
        this.tipTen = tipTen;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Tip ten: " + tipTen);
    }
}
