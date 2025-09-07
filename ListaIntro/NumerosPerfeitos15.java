/* Escreva um programa que escreve os 4 primeiros números perfeitos. 
Um número perfeito é aquele que é igual à soma dos seus divisores 
(exceto o próprio número). 
Exemplos: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14. */

// Programa que escreve os 4 primeiros números perfeitos

public class NumerosPerfeitos15 {
    public static void main(String[] args) {
        int count = 0;
        int n = 2; // começa do 2, pois 1 não é perfeito

        System.out.println("Os 4 primeiros números perfeitos são:");

        while (count < 4) {
            int soma = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    soma += i;
                }
            }

            if (soma == n) {
                System.out.println(n);
                count++;
            }

            n++;
        }
    }
}
