package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Vendedor Vendedor = new Vendedor();
        Region regionMetropolitana = new Region( 13,"Metropolitana");
        Region regionArica = new Region(15, "Arica");
        Region regionMaule = new Region(7, "Maule");

    }
}