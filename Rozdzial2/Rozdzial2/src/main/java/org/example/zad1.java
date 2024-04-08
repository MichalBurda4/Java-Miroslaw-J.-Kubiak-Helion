package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Program sprawdza dla trzech boków trokąta a,b i c wporwadzonych z klawiatury, czy tworzą one trójkąt prostoątny ");
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dlugosc boku a: ");
        a = scanner.nextInt();
        System.out.println("Podaj dlugosc boku b: ");
        b = scanner.nextInt();
        System.out.println("Podaj dlugosc boku c: ");
        c = scanner.nextInt();

        if(a < 0 || b < 0 || c< 0){
            System.out.println("Podałeś ujemną wartość boku!");
            return;
        }

        if(a*a + b*b == c*c){
            System.out.println("Podane boki tworzą trojkąt prostokątny");
        }else{
            System.out.println("Podane boki nie tworzą trójkąta prostokątnego");
        }


    }
}
