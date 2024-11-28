package com.mycompany.lab9;

class GelDeDus extends Cosmetice {
    private String miros;

    public GelDeDus(String denumire, String producator, double pret, String miros) {
        super(denumire, producator, pret);
        this.miros = miros;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Miros: " + miros);
    }
}