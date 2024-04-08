package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad1
{
    public static void main(String[] args) throws IOException
    {
        double a;
        double b;
        double pole;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj bok b: ");
        b = scanner.nextDouble();

        pole = a*b;
        System.out.println("Pole prostokata wynosi: " + pole);
    }
}
