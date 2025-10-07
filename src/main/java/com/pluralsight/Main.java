package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                String[] quotes = {
                        "Je pense donc je suis!",
                        "Qui vivra verra!",
                        "C’est la vie!",
                        "Vivre sans aimer n’est pas vivre!",
                        "Liberté, égalité, fraternité!",
                        "Après moi, le déluge!",
                        "Le cœur a ses raisons que la raison ne connaît point!",
                        "Rien ne se perd, rien ne se crée, tout se transforme!",
                        "Je suit rien sans toi!",
                        " Live, Laugh and be happy"
                };
                System.out.print("Pick a quote ( select #1 - #10): ");
                int index = Integer.parseInt( scanner.nextLine());

                index--;
                System.out.println(quotes[index]);
            } catch (Exception e) {
                System.out.println(" Invalid selection, choose from 1 to 10!");
                e.printStackTrace();
            }


            System.out.println(" Would you like to try another one: (Y/N)");

        } while(scanner.nextLine().equalsIgnoreCase("y"));
    }
}
