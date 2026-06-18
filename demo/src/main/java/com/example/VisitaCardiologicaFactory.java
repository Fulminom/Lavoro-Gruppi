package com.example;

import java.util.Scanner;

public class VisitaCardiologicaFactory implements InterfacciaVisita {
    @Override
    public Visita creaVisita(Scanner sc) {
        System.out.print("\nDiagnosi: ");
        String diagnosi = sc.nextLine();

        System.out.print("\nMedico: ");
        String medico = sc.nextLine();

        System.out.print("\nFrequenza cardiaca: ");
        int frequenzaCardiaca = Integer.parseInt(sc.nextLine());

        System.out.print("\nPressione sistolica: ");
        int pressioneSist = Integer.parseInt(sc.nextLine());

        System.out.print("\nPressione diastolica: ");
        int pressioneDiast = Integer.parseInt(sc.nextLine());

        return new VisitaCardiologica(diagnosi, medico, frequenzaCardiaca, pressioneSist, pressioneDiast);
    }
}
