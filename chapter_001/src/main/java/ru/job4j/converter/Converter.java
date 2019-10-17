package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");

        int ruble = dollarToRuble(2);
        System.out.println("2 dollars are " + ruble + " ruble.");

        int ruble1 = euroToRuble(2);
        System.out.println("2 euros are " + ruble1 + " ruble.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 RUR is 2 EUR. Result: " + passed);

        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("120 RUR is 2 USD. Result: " + passed1);

        int in2 = 2;
        int expected2 = 140;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("2 EUR is 140 RUR. Result: " + passed2);

        int in3 = 2;
        int expected3 = 120;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("2 USD is 120 RUR. Result: " + passed3);
    }
}