/* Crie uma função recursiva potencia(base,expoente) que, quando chamada,
    retorna baseexpoente . Por exemplo, potencia(3,4) deve ser implementado 
    como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas 81 nesse exemplo) Assuma que 
    expoente é um inteiro maior ou igual a 1. */

/* Crie uma função recursiva potencia(base,expoente) que, quando chamada, retorna baseexpoente */

import java.util.Scanner;

public class PotencialRecursiva18 {
    // Função recursiva
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        } else {
            return base * potencia(base, expoente - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (>=1): ");
        int expoente = scanner.nextInt();

        if (expoente < 1) {
            System.out.println("Expoente inválido!");
            scanner.close();
            return;
        }

        int resultado = potencia(base, expoente);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
