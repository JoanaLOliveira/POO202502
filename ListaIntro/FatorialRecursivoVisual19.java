/* Escreva uma função que calcule o fatorial de forma recursiva. Para cada
 chamada recursiva, exiba as saídas em uma linha separada e adicione um 
 nível de recuo (tabulação). Faça o melhor que você puder para tornar a 
 saída limpa, interessante e significativa. Seu objetivo aqui é projetar 
 e implementar um formato de saída que facilite o entendimento da recursão. 
 Por exemplo, para uma entrada n = 5, o programa deve exibir: 
 0! = 1 1! = 1 2! = 2 3! = 6 4! = 24 5! = 120 */

import java.util.Scanner;

public class FatorialRecursivoVisual19 {
    public static int fatorial(int n, int nivel) {
        // Exibir indentação de acordo com o nível da recursão
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println("Calculando " + n + "!");

        int resultado;
        if (n == 0) {
            resultado = 1;
        } else {
            resultado = n * fatorial(n - 1, nivel + 1);
        }

        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(n + "! = " + resultado);

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Número inválido!");
            scanner.close();
            return;
        }

        fatorial(n, 0);
        scanner.close();
    }
}
