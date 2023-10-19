package snaks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Snak6 {
    /*
    text exe:
        Genera un array di 10 numeri casuali e crea una stringa  che lo rappresenta nella forma [valore1, valore2, …, valoreN] senza usare il metodo Arrays.toString()
     */
    public static void main(String[] args) {
        // inizializziamo il randomizzer di numeri
        Random randomNumbers = new Random();

        // variabili uttili
        int howManyNumbers = 10;
        int valueOfMaxRange = 100;
        String numbersInStringForm = "[";

        // primo metodo

        // int[] arrayOfTheValues = new int[howManyNumbers];

        // ciclo per ottenere i valori
        /*
        for (int i = 0; i < howManyNumbers; i++) {
            int randomNumber = randomNumbers.nextInt(0, valueOfMaxRange);
            arrayOfTheValues[i] = randomNumber;
        }

        // stampa array creato
        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println(arrayOfTheValues[i]);
        }

        for (int i = 0; i < howManyNumbers; i++) {
        numbersInStringForm += arrayOfTheValues[i];
        }

        for (int i = 0; i < howManyNumbers; i++) {
            numbersInStringForm.append(arrayOfTheValues[i]);
        }

         */


        //secondo metodo
        for (int i = 0; i < howManyNumbers; i++) {
            int randomNumber = randomNumbers.nextInt(0, valueOfMaxRange);
            if (howManyNumbers - 1 == i){
                numbersInStringForm += randomNumber;
            }else {
                numbersInStringForm += randomNumber + ", ";
            }
        }

        numbersInStringForm += "]";

        System.out.println(numbersInStringForm);
    }
}
