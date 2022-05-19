package aulalp;

import java.util.Scanner;

public class aulinher {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 100 --> ");
        int n = in.nextInt();

        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        }
    }
}
