package org.java.travel;

import java.time.LocalDate;
import java.util.Scanner;

public class Agenzia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        boolean ripeti = true;


        while (ripeti == true) {
            System.out.println("Vuoi inserire una nuova vacanza? yes/not");
            String scelta = scan.nextLine();
            if (scelta.equals("yes")) {
                System.out.println("dove vuoi andare?");
                String destinazione = scan.nextLine();
                System.out.println("in che data vuoi partire?");
                LocalDate datainizio = LocalDate.parse(scan.nextLine());
                System.out.println("in che data vuoi tornare?");
                LocalDate datafine = LocalDate.parse(scan.nextLine());
                Vacanza vacanza = new Vacanza(destinazione, datainizio, datafine);
                System.out.println("hai prenotato una vacanza di );
            } else if (scelta.equals("not")) {
                System.out.println("arrivederci");
            }
        }
    }
}
