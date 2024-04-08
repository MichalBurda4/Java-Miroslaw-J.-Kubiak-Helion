package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program oblicza wartosc x z rowanania ax + b = c");
        double a, b = 0, c = 0, x;

        System.out.println("a: ");
        a = scanner.nextDouble();
        if(a == 0){
            System.out.println("Podałeś złą wartość a!");
        }else{
            System.out.println("b: ");
            b = scanner.nextDouble();
            System.out.println("c: ");
            c = scanner.nextDouble();

        }

        x = (c-b)/a;
        System.out.printf("Wartosc x wynosi: " + "%4.2f\n", x);
    }
}
