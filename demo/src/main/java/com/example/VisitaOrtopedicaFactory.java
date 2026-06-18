package com.example;

import java.util.Scanner;

public class VisitaOrtopedicaFactory implements InterfacciaVisita {
    @Override
    public Visita creaVisita(Scanner sc) {
        System.out.print("\nDiagnosi: ");
        String diagnosi = sc.nextLine();

        System.out.print("\nMedico: ");
        String medico = sc.nextLine();

        System.out.print("\nParte del corpo: ");
        String parteCorpo = sc.nextLine();

        return new VisitaOrtopedica(diagnosi, medico, parteCorpo);
    }
}
