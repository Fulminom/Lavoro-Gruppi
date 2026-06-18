package com.example;

import java.util.Scanner;

public class VisitaGenericaFactory implements InterfacciaVisita {
    @Override
    public Visita creaVisita(Scanner sc) {
        System.out.print("\nMedico: ");
        String medico = sc.nextLine();

        System.out.print("\nDiagnosi: ");
        String diagnosi = sc.nextLine();

        System.out.print("\nReparto: ");
        String reparto = sc.nextLine();

        return new VisitaGenerica(diagnosi, medico, reparto);
    }
}
