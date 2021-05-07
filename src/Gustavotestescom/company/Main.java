package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your temperature in celsius");
        c = scanner.nextInt();

        System.out.println("The temperature in fahrenheit is " + ((c * 9 / 5 + 32))) ;
    }
}
