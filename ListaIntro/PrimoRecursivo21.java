/* Crie uma função recursiva que verifique se um dado número é primo. */

import java.util.Scanner;

public class PrimoRecursivo21 {
    // Função recursiva para verificar se n é primo
    public static boolean ehPrimo(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor * divisor > n) {
            return true; // nenhum divisor encontrado
        }
        if (n % divisor == 0) {
            return false; // encontrou um divisor
        } else {
            return ehPrimo(n, divisor + 1); // verifica próximo divisor
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (ehPrimo(num, 2)) {
            System.out.println(num + " é primo.");
        } else {
            System.out.println(num + " não é primo.");
        }

        scanner.close();
    }
}
