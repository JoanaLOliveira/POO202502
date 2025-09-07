/* Escreva um programa que calcule a área de um quadrado. O valor do 
lado de um quadrado deverá ser informado pelo usuário. */

/* Programa que calcula a área de um quadrado */


import java.util.Scanner;

public class AreaQuadrado1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area,lado;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado=scanner.nextDouble();

        area=lado*lado;

        System.out.print("A área do quadrado é: "+area);

        scanner.close();
    }
}
