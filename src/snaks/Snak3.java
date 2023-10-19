package snaks;

import java.util.Scanner;

public class Snak3 {
    /*
    text exe:
        Il software deve chiedere per 10 volte all’utente di inserire un numero. Il programma stampa la somma di tutti i numeri inseriti.
     */
    public static void main(String[] args) {
        // inizializziamo lo scanner
        Scanner userInput = new Scanner(System.in);

        // chiediamo i valori all'utente
        int numberIterazions = 10;
        double totalValue = 0;

        for (int i = 1; i <= numberIterazions; i++) {
            System.out.print("Value number " + i + ": ");
            double userValue = Double.parseDouble(userInput.nextLine());

            totalValue += userValue;
        }

        // stampiamo il valore finale
        System.out.println("The total is: " + totalValue);

        // terminiamo lo scanner
        userInput.close();
    }
}
