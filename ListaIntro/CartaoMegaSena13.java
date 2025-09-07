/* Escreva um programa para imprimir uma versão aproximada de um cartão 
da Mega-Sena (somente com os números, respeitando o número de linhas e a 
distribuição dos números nas linhas). */

// Imprime uma versão aproximada de um cartão da Mega-Sena

public class CartaoMegaSena13 {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 6; i++) {          // 6 linhas
            for (int j = 1; j <= 10; j++) {     // 10 números por linha
                if (num <= 60) {
                    System.out.printf("%2d ", num);
                    num++;
                }
            }
            System.out.println(); // quebra de linha
        }
    }
}
