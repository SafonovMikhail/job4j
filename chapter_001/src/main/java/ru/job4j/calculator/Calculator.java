package ru.job4j.calculator;

/**
 * Calculator
 *
 * @author Mikhail Safonov
 */


public class Calculator {
    /**
     * Выводит в консоль результат суммы двух чисел
     * @param first
     * @param second
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }
    /**
     * Выводит в консоль результат деления двух чисел
     * @param first
     * @param second
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }
    /**
     * Выводит в консоль результат умножение двух чисел
     * @param first
     * @param second
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }
    /**
     * Выводит в консоль результат вычитания двух чисел
     * @param first
     * @param second
     */
    public static void substract(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        add(1, 2);
        div(4, 2);
        multiply(2, 1);
        substract(10, 5);
    }
}