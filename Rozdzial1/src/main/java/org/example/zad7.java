package org.example;

import java.util.Scanner;

public class zad7
{
    public static void main(String[] args)
    {
        System.out.println("Program oblicza sume, różnicę iloczyn oraz iloraz dla dwóch liczb x i y wprowadzonych z klawiatury");
        float x;
        float y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj x: ");
        x = scanner.nextFloat();
        System.out.println("Podaj y: ");
        y = scanner.nextFloat();
        float suma, roznica, iloczyn, iloraz;
        suma = x + y;
        iloczyn = x*y;
        iloraz = x/y;
        roznica = x-y;
        System.out.printf("Liczba x to: " + "%2.2f\n", + x);
        System.out.printf("Libcz y to: " + "%2.2f\n", y);
        System.out.printf("Suma to: " + "%2.2f\n", suma);
        System.out.printf("Roznica to: " + "%2.2f\n", roznica);
        System.out.printf("Iloczyn to: " + "%2.2f\n", iloczyn);
        System.out.printf("Iloraz to: " + "%2.2f\n", iloraz);
    }
}
