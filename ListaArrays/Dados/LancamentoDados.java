/* Escreva um aplicativo para simular o lançamento de dois dados. O aplicativo deve utilizar
um objeto da classe Random, uma vez para lançar o primeiro dado e novamente para
lançar o segundo dado. A soma dos dois valores deve então ser calculada. Cada dado
pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 2 a
12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. Seu
aplicativo deve lançar o dado 36.000.000 vezes. Utilize um array unidimensional para
contar o número de vezes que cada possível soma aparece. Exiba os resultados. */


package Dados;

import java.util.Random;

public class LancamentoDados {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] frequencias = new int[13]; // índices 2 a 12 serão usados

        int totalLancamentos = 36_000_000;

        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = rand.nextInt(6) + 1; // valores 1 a 6
            int dado2 = rand.nextInt(6) + 1;
            int soma = dado1 + dado2;

            frequencias[soma]++;
        }

        // Exibir resultados
        System.out.println("Soma\tFrequência\tProbabilidade (%)");
        for (int i = 2; i <= 12; i++) {
            double prob = (frequencias[i] * 100.0) / totalLancamentos;
            System.out.printf("%d\t%d\t\t%.2f%%\n", i, frequencias[i], prob);
        }
    }
}
