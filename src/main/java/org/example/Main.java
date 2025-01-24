package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Los primeros 10 numeros primos son:");
        int counter = 0;
        Integer number = 1;

        while (counter < 10) {
            number++;
            if (!isPrime(number)) {
                continue;
            }
            System.out.println("Numero primo: ".concat(number.toString()));
            counter++;
        }
    }

    private static Boolean isPrime(Integer number) {
        for (int i = 2; i < number; ++i) {
            if (number%i ==0) {
                return false;
            }
        }
        return true;
    }
}