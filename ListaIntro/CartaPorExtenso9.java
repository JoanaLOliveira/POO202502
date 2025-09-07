/* Escreva um programa que lê um número que representa o valor da carta, 
    de um (ás) a treze (rei), e outro número correspondente ao naipe 
    (1 = ouros, 2 = paus, 3 = copas e 4 = espadas). O programa deve 
    imprimir o nome da carta por extenso. */

// Programa que imprime o nome de uma carta com base no valor e no naipe

import java.util.Scanner;

public class CartaPorExtenso9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da carta (1 a 13): ");
        int valor = scanner.nextInt();

        System.out.print("Digite o naipe (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        int naipe = scanner.nextInt();

        String nomeCarta;
        String nomeNaipe;

        // Determinar o nome da carta
        switch (valor) {
            case 1: nomeCarta = "Ás";
            break;
            case 2: nomeCarta = "2"; break;
            case 3: nomeCarta = "3"; break;
            case 4: nomeCarta = "4"; break;
            case 5: nomeCarta = "5"; break;
            case 6: nomeCarta = "6"; break;
            case 7: nomeCarta = "7"; break;
            case 8: nomeCarta = "8"; break;
            case 9: nomeCarta = "9"; break;
            case 10: nomeCarta = "10"; break;
            case 11: nomeCarta = "Valete"; break;
            case 12: nomeCarta = "Dama"; break;
            case 13: nomeCarta = "Rei"; break;
            default:
                System.out.println("Valor inválido!");
                scanner.close();
                return;
        }

        // Determinar o nome do naipe
        switch (naipe) {
            case 1: nomeNaipe = "Ouros"; break;
            case 2: nomeNaipe = "Paus"; break;
            case 3: nomeNaipe = "Copas"; break;
            case 4: nomeNaipe = "Espadas"; break;
            default:
                System.out.println("Naipe inválido!");
                scanner.close();
                return;
        }

        System.out.println("Carta: " + nomeCarta + " de " + nomeNaipe);

        scanner.close();
    }
}
