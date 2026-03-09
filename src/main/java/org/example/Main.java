package org.example;

public class Main {

    public String convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        Main main = new Main();

        for (int i = 1; i <= 15; i++) {
            System.out.println(main.convert(i));
        }
    }
}