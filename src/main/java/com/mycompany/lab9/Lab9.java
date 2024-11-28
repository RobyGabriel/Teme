package com.mycompany.lab9;

public class Lab9 {
    public static void main(String[] args) {
        Sampon sampon1 = new Sampon("Head & Shoulders Classic", "Procter & Gamble", 25.5, "Pentru scalp sensibil");
        Sampon sampon2 = new Sampon("L'Oreal Elseve", "L'Oreal", 30.0, "Pentru par gras");
        Sampon sampon3 = new Sampon("Dove Nutritive Solutions", "Unilever", 28.5, "Pentru par uscat");

        CremaFata cremaFata1 = new CremaFata("NIVEA Soft", "Beiersdorf", 45.0, "Ten normal");
        CremaFata cremaFata2 = new CremaFata("L'Oreal Revitalift", "L'Oreal", 50.0, "Ten matur");
        CremaFata cremaFata3 = new CremaFata("Garnier Bio", "Garnier", 40.0, "Ten mixt");

        CremaCorp cremaCorp1 = new CremaCorp("Vaseline Cocoa Glow", "Unilever", 35.0, "Cacao");
        CremaCorp cremaCorp2 = new CremaCorp("The Body Shop Shea Butter", "The Body Shop", 40.0, "Unt de shea");
        CremaCorp cremaCorp3 = new CremaCorp("NIVEA Q10", "Beiersdorf", 38.0, "Vanilie");

        AfterShave afterShave1 = new AfterShave("Gillette After Shave Gel", "Procter & Gamble", 25.0, true);
        AfterShave afterShave2 = new AfterShave("NIVEA Men Sensitive", "Beiersdorf", 30.0, false);
        AfterShave afterShave3 = new AfterShave("Old Spice Original", "Procter & Gamble", 35.0, true);

        GelDeDus gelDeDus1 = new GelDeDus("Dove Gentle Exfoliating", "Unilever", 20.0, "Lapte si orez");
        GelDeDus gelDeDus2 = new GelDeDus("Palmolive Aroma Therapy", "Colgate-Palmolive", 22.0, "Lavanda");
        GelDeDus gelDeDus3 = new GelDeDus("NIVEA Creme Care", "Beiersdorf", 24.0, "Clasic");

        sampon1.afiseaza();
        sampon2.afiseaza();
        sampon3.afiseaza();
        System.out.println();

        cremaFata1.afiseaza();
        cremaFata2.afiseaza();
        cremaFata3.afiseaza();
        System.out.println();

        cremaCorp1.afiseaza();
        cremaCorp2.afiseaza();
        cremaCorp3.afiseaza();
        System.out.println();

        afterShave1.afiseaza();
        afterShave2.afiseaza();
        afterShave3.afiseaza();
        System.out.println();

        gelDeDus1.afiseaza();
        gelDeDus2.afiseaza();
        gelDeDus3.afiseaza();
    }
}