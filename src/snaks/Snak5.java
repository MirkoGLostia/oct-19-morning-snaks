package snaks;

import java.util.Scanner;

public class Snak5 {
    /*
    text exe:
        Stampa il cubo dei primi N numeri, dove N è un numero indicato dall’utente.
     */
    public static void main(String[] args) {
        // inizializziamo lo scanner
        Scanner userInput = new Scanner(System.in);

        // chiediamo un numero all'utente
        System.out.println("Give me a number ");
        int userValue = Integer.parseInt(userInput.nextLine());

        // stampiamo il risultato
        System.out.println("This are the cubes of the values before " + userValue + " and itself:");
        for (int i = 0; i <= userValue; i++) {
            int cubeOfValue = i * i * i;
            System.out.println(cubeOfValue);
        }

        // terminiamo lo scanner
        userInput.close();
    }
}
