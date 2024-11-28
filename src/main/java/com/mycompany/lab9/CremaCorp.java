package com.mycompany.lab9;

class CremaCorp extends Cosmetice {
    private String aroma;

    public CremaCorp(String denumire, String producator, double pret, String aroma) {
        super(denumire, producator, pret);
        this.aroma = aroma;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Aroma: " + aroma);
    }
}
