package org.example;

public class zad3 {
    public static void main(String[] args)
    {
        System.out.println("Program wyświetla na ekranie pierwiastek kwadratowy z liczby pi =3.14 z dokładnością do 2 miejsc po przecinku");
        System.out.printf("Sqrt(pi) = " + "%2.2f\n", + Math.sqrt(Math.PI));
        //% oznacza, że jest to miejsce, gdzie zostanie wstawiona wartość.
        //2 oznacza minimalną szerokość pola, na które zostanie wstawiona liczba. W tym przypadku
        //.2 oznacza, że liczba zostanie zaokrąglona do dwóch miejsc po przecinku.
        //f oznacza, że wartość wstawiona do miejsca %2.2f będzie zmiennoprzecinkowa (float).
        //\n to znak nowej linii, który przenosi kursor na początek następnej linii po wypisaniu wartości.
    }
}
