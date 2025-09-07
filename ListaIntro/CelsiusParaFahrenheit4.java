/* Escreva um programa que receba uma temperatura em graus centígrados 
e a apresente em graus Fahrenheit. */

// Programa que converte graus Celsius para Fahrenheit

import java.util.Scanner;

public class CelsiusParaFahrenheit4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Digite a temperatura em Graus Celsius: ");
        celsius=scanner.nextDouble();

        fahrenheit=(celsius*9.0/5.0)+32;

        System.out.println("A temperatura em Fahrenheit é: "+fahrenheit);

        scanner.close();
    }
}
