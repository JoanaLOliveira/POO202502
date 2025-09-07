/* Escreva um programa que apresente a série de Fibonacci até o n-ézimo 
termo. Assuma que n > 0. */

// Programa que apresenta a série de Fibonacci até o n-ésimo termo

import java.util.Scanner;

public class Fibonacci14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido! n deve ser maior que 0.");
            scanner.close();
            return;
        }

        int a = 0, b = 1;

        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}
