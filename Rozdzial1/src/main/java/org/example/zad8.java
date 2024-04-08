package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad8
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Program oblicza pole prostokąta o bokach a i b");
        Scanner scanner = new Scanner(System.in);
        double a, b, pole;
        try
        {
            System.out.println("Podaj wartosc boku a: ");
            a = scanner.nextDouble();
            System.out.println("Podaj wartosc boku b: ");
            b = scanner.nextDouble();
            pole = a*b;
            System.out.println("Pole wynosi: " + pole);
        }
        catch (NumberFormatException exc)
        {
            System.out.println("Nie wczytano liczby. Koniec programu.");
        }
    }
}
