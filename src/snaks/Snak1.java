package snaks;

import java.util.Scanner;

public class Snak1 {
        /*
        testo exe:
            L’utente inserisce due numeri in successione. Il software stampa il maggiore.
         */
    public static void main(String[] args) {

        // inizializziamo lo scanner
        Scanner userInput = new Scanner(System.in);

        // chiediamo i due numeri all'utente
        System.out.print("First value: ");
        double num1 = Double.parseDouble(userInput.nextLine());

        System.out.print("Second value: ");
        double num2 = Double.parseDouble(userInput.nextLine());

        // confrontiamo i valori
        if (num1 > num2){
            System.out.println(num1 + " is the higher value");
        } else if (num1 < num2) {
            System.out.println(num2 + " is the higher value");
        }else {
            System.out.println("values are equals");
        }

        // terminiamo lo scanner
        userInput.close();
    }
}
