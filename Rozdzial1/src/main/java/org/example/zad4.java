package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad4
{
    public static void main(String[] args) throws IOException
    {
        double obj, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość promienia kuli: ");
        r = scanner.nextDouble();
        obj = 4.0/3.0*Math.PI*r*r*r;
        System.out.printf("Objętość wynosi = " + "%.2f\n", obj);
    }
}
