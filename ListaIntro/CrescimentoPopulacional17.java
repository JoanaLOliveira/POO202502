/* Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, 
respectivamente. A cidade A tem um crescimento populacional de 3, 5% ao 
ano, enquanto a população da cidade B cresce 1% ao ano. Faça um programa
que utilize laço(s) para calcular a quantidade de anos necessária para que 
a população da cidade A seja maior ou igual a população da cidade B. */

// Programa que calcula o número de anos até que a população de A seja maior ou igual a B


public class CrescimentoPopulacional17 {
    public static void main(String[] args) {
        double popA = 7000;
        double popB = 20000;
        int anos = 0;

        while (popA < popB) {
            popA = popA * 1.035; // crescimento de 3,5%
            popB = popB * 1.01;  // crescimento de 1%
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população de A seja maior ou igual à de B.");
        System.out.printf("População final de A: %.0f\n", popA);
        System.out.printf("População final de B: %.0f\n", popB);
    }
}
