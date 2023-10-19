package snaks;

import java.util.Scanner;

public class Snak4 {
    /*
    text exe:
        Chiedi per 6 volte all’utente di inserire un numero, se è dispari mostrare questa informazione a video
     */
    public static void main(String[] args) {
        // inizializziamo lo scanner
        Scanner userInput = new Scanner(System.in);

        // chiediamo i valori all'utente
        int numberIterazions = 6;

        for (int i = 1; i <= numberIterazions; i++) {
            System.out.print("Value number " + i + ": ");
            int userValue = Integer.parseInt(userInput.nextLine());

            if (userValue % 2 == 1){
                System.out.println("This is odd");
            }
        }

        // terminiamo lo scanner
        userInput.close();
    }
}
