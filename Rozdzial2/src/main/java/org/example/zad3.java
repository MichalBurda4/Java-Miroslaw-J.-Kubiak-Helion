package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException
    {
        double a, b = 0, c, delta = 0, x1, x2;
        int lp = 0;
        System.out.println("Podaj wartosc a: ");
        a = scanner.nextDouble();
        if(a == 0){
            System.out.println("Podałeś złą wartosc liczby a!");
        }else{
            System.out.println("Podaj wartosc zmiennej b: ");
            b = scanner.nextDouble();
            System.out.println("Podaj wartosc zmiennej c: ");
            c = scanner.nextDouble();
            delta = b*b - 4*a*c;
        }

        if(delta == 0) lp = 1;
        if(delta > 0) lp = 2;
        if(delta < 0) lp = 0;

        switch (lp)
        {
            case 0:{
                System.out.println("Brak rozwiazan");
            }
            break;
            case 1:{
                x1 = -b/(2*a);
                System.out.println(x1);
            }
            break;
            case 2:{
                x1 = (-b - Math.sqrt(delta))/(2*a);
                x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.printf("Pierwszym pierwisatkiem równiania jest: " + "%4.2f\n", x1);
                System.out.printf("Drugim pierwisatkiem równiania jest: " + "%4.2f\n", x2);
            }
            break;
        }








    }
}
