/* Dado um polinômio Pn(x) = a0x n + a1x n−1 + · · · + an−1x + an (1) 
este pode ser definido recursivamente como Pn(x) = xPn−1(x) + an (2) 
Escreva uma função recursiva para calcular Pn(x). Os parâmetros n, a0,
 · · · , an e o valor x devem ser solicitados ao usuário na função main. */

import java.util.Scanner;

public class PolinomioRecursivo22 {
    // Função recursiva para calcular Pn(x)
    public static double polinomio(int n, double[] coef, double x) {
        if (n == 0) {
            return coef[0]; // caso base: P0(x) = a0
        } else {
            return x * polinomio(n - 1, coef, x) + coef[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o grau do polinômio: ");
        int n = scanner.nextInt();

        double[] coef = new double[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coef[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado = polinomio(n, coef, x);
        System.out.printf("O valor do polinômio é: %.2f\n", resultado);

        scanner.close();
    }
}
