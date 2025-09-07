/* O mês de fevereiro de 2015 começou em um domingo. Escreva um programa 
que, dado o número de um dia do mês de fevereiro de 2015 (um valor entre 
1 e 28), imprime o dia da semana correspondente. 
• Exemplo de entrada: 10 
• Exemplo de saída: O dia 10 será uma terça-feira. */

// Programa que determina o dia da semana para fevereiro de 2015

import java.util.Scanner;

public class DiaDaSemanaFevereiro12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do mês (1 a 28): ");
        int dia = scanner.nextInt();

        if (dia < 1 || dia > 28) {
            System.out.println("Dia inválido!");
            scanner.close();
            return;
        }

        String diaSemana;
        switch (dia % 7) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda-feira";
                break;
            case 3:
                diaSemana = "terça-feira";
                break;
            case 4:
                diaSemana = "quarta-feira";
                break;
            case 5:
                diaSemana = "quinta-feira";
                break;
            case 6:
                diaSemana = "sexta-feira";
                break;
            case 0:
                diaSemana = "sábado"; // 7 % 7 = 0
                break;
            default:
                diaSemana = ""; // nunca será usado
        }

        System.out.println("O dia " + dia + " será uma " + diaSemana + ".");

        scanner.close();
    }

}
