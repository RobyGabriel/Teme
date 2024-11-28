package com.mycompany.lab9;

public class Ex25 
{

    public static void main(String[] args) {
        AdresaEmail expeditor = new AdresaEmail("expeditor@example.com");
        AdresaEmail destinatar = new AdresaEmail("destinatar@example.com");

        Email email = new Email(expeditor, destinatar, "Salut!", "Acesta este un email de test.");
        
        email.trimite();
        System.out.println();       
        email.primeste();
    }
}
