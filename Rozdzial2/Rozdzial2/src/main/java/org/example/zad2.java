package org.example;

import java.io.IOException;
import java.util.Scanner;

public class zad2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.println("Program oblicza pierwiastki równaiania kwadratowego ax^2 + bx +c = 0");
        double a, b, c, x1, x2, delta;
        System.out.println("Podaj dlugosc boku a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj dlugosc boku b: ");
        b = scanner.nextDouble();
        System.out.println("Podaj dlugosc boku c: ");
        c = scanner.nextDouble();
        delta = b*b - 4*a*c;

        if(delta < 0){
            System.out.println("Brak pierwiastkow rzeczywistych ");
        } else{
            if(delta  == 0){
                x1 = -b/2*a;
                System.out.printf("Jest jeden pierwiastek równiania x1 i wynosi on: " + "%4.2f\n", x1);

            }else{
                x1 = (-b - Math.sqrt(delta))/(2*a);
                x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.printf("Pierwszym pierwisatkiem równiania jest: " + "%4.2f\n", x1);
                System.out.printf("Drugim pierwisatkiem równiania jest: " + "%4.2f\n", x2);

            }
        }





    }
}
