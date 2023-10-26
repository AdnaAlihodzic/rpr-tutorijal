package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite prvi broj: ");
        int a = input.nextInt();

        System.out.print("Unesite drugi broj: ");
        int b = input.nextInt();

        System.out.println("Prvi broj: " + a);
        System.out.println("Drugi broj: " + b);

        input.close();
    }
}
