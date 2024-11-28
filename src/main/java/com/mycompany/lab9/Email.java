package com.mycompany.lab9;

class Email {
    private AdresaEmail expeditor;
    private AdresaEmail destinatar;
    private String subiect;
    private String continut;

    public Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String continut) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.continut = continut;
    }

    public void trimite() {
        System.out.println("Trimitere email de la: " + expeditor.getAdresa());
        System.out.println("Catre: " + destinatar.getAdresa());
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: " + continut);
    }

    public void primeste() {
        System.out.println("Email primit de la: " + expeditor.getAdresa());
        System.out.println("Subiect: " + subiect);
        System.out.println("Continut: " + continut);
    }
}
