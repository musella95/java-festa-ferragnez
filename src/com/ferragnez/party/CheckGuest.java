package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        // creo un array di stringhe e gli assegno il suo valore
        String[] partyGuest = {
                "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };
        // avvio lo scanner
        Scanner scan = new Scanner(System.in);
        // chiedo all'utente come si chiama
        System.out.println("Come ti chiami?");
        //inserisco i dati forniti dall'utente
        String nameUser = scan.nextLine();
        boolean found = false;
       /* for (int i = 0; i < partyGuest.length && !found; i++) {
            if (nameUser.equals(partyGuest[i])){
                found = true;
            }

        }
        if(found){ // come dire found == false
            System.out.println(" BEVENUTO NEL DISAGIO");
        } else {
            System.out.println("SEI SALVO NON FAI PARTE DI LORO");
        }

     */
        int i = 0;
        while (i < partyGuest.length && !found) {
            if (nameUser.equals(partyGuest[i])) {
                found = true;
            }
            i++;
        }
        if (found) { // come dire found == false
            System.out.println(" BEVENUTO NEL DISAGIO GG");
        } else {
            System.out.println("SEI SALVO NON FAI PARTE DI LORO");
        }
        scan.close();
    }
}


