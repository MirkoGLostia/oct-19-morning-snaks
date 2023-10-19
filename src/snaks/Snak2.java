package snaks;

import java.util.Scanner;

public class Snak2 {
    /*
    text exe:
        L’utente inserisce due parole in successione. Il software stampa prima la parola più corta, poi la parola più lunga.
     */
    public static void main(String[] args) {
        // inizializziamo lo scanner
        Scanner userInput = new Scanner(System.in);

        // otteniamo i dati dall'utente
        System.out.print("First word: ");
        String word1 = userInput.nextLine();

        System.out.print("Second word: ");
        String word2 = userInput.nextLine();

        // confrontiamo le parole
        if (word1.length() < word2.length() || word1.length() == word2.length()){
            System.out.println(word1);
            System.out.println(word2);
        } else if (word1.length() > word2.length()) {
            System.out.println(word2);
            System.out.println(word1);
        }

        // terminiamo lo scanner
        userInput.close();
    }
}
