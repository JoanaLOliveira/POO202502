/* Escreva um programa que recebe um valor inteiro representando um 
intervalo em minutos e imprime o equivalente a esse período expresso 
em valores inteiros para dias, horas e minutos. 
Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos. */

// Converte um valor em minutos para dias, horas e minutos

import java.util.Scanner;

public class MinutosParaDiasHorasMinutos6 {
    public static void main(String[] args) {
        int totalMinutos,dias,horas,minutosRestantes;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o intervalo em Minutos: ");
        totalMinutos = scanner.nextInt();

        dias=totalMinutos/1440;
        horas=(totalMinutos%1440)/60;
        minutosRestantes=(totalMinutos%1440)%60;

        System.out.println(totalMinutos+" minutos = "+dias+" dias "+horas+" horas "+minutosRestantes+ " minutos.");

        scanner.close();
    }
}
