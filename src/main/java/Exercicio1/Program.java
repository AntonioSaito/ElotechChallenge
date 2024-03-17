package Exercicio1;

import java.util.Scanner;

public class Program {
    //WordInverter
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a word: ");
        String word = sc.next();
        StringBuilder inverseWord = new StringBuilder(word);
        inverseWord.reverse();
        System.out.printf("Inverse word is: " + inverseWord);

    }
}
