package org.example;

public class Main {

    public String convert(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {

    }
}