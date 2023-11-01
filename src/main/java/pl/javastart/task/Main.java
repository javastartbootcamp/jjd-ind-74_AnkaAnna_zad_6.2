package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Wprowadź " + size + " liczb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        double pow = 0;
        double sum = 0;
        for (double element : array) {
            pow = Math.pow(element, 2);
            sum = sum + pow;
        }
        System.out.println("Suma kwadratów wprowadzonych liczb to " + sum);
    }
}
