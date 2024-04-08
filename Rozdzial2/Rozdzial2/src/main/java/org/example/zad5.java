package org.example;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("Porgram zgaduje liczbę losową z przedziału 0 do 9 generowaną przez komputer");
        double losujl, zgadnijl;
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        losujl = Math.round(10*(r.nextDouble()));
        System.out.println("podaj liczbe:");
        zgadnijl = scanner.nextDouble();

        if(losujl == zgadnijl){
            System.out.println("Zgales");
        }else{
            System.out.printf("Wylosowana liczba to: " + losujl);
        }

    }
}
