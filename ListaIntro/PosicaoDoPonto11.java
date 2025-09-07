/* Escreva um programa que lê dois pontos no plano cartesiano com 
coordenadas x e y e informa se o segundo ponto está acima, abaixo,
à esquerda e/ou à direita do primeiro. */

// Programa que lê dois pontos e informa a posição do segundo em relação ao primeiro


import java.util.Scanner;

public class PosicaoDoPonto11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x do primeiro ponto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite a coordenada y do primeiro ponto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite a coordenada x do segundo ponto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Digite a coordenada y do segundo ponto: ");
        double y2 = scanner.nextDouble();

        if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro.");
        } else if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro.");
        }

        if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro.");
        } else if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro.");
        }

        if (x2 == x1 && y2 == y1) {
            System.out.println("O segundo ponto coincide com o primeiro.");
        }

        scanner.close();
    }
}
