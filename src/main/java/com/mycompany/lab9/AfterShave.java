package com.mycompany.lab9;

class AfterShave extends Cosmetice {
    private boolean alcool;

    public AfterShave(String denumire, String producator, double pret, boolean alcool) {
        super(denumire, producator, pret);
        this.alcool = alcool;
    }

    @Override
    public void afiseaza() {
        super.afiseaza();
        System.out.println("Contine alcool: " + (alcool ? "Da" : "Nu"));
    }
}
