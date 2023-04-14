package com.modsen;


import java.util.InputMismatchException;

import com.modsen.Exceptions.EmptyExpressionException;
import com.modsen.Logic.InputParser;


public class Main {
    public static void main(String[] args) {
        InputParser parser = new InputParser();
        System.out.print("Введите выражение: ");

        try {
            parser.read();
        } catch (InputMismatchException e) {
            System.err.println(e);
        }

        try {
            System.out.println("Результат: " + parser.calculate());
        } catch (EmptyExpressionException e) {
            System.err.println(e);
        }
    }
}
