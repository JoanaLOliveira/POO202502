/* Escreva um programa que calcule a soma e a média aritmética de 3 
números. Os 3 valores reais serão informados pelo usuário. */

/* Programa que calcula a soma e a média de 3 números reais */


import java.util.Scanner;

public class SomaEMedia2 {
    public static void main(String[] args) {
        double n1,n2,n3,soma,media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        n1=scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2=scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        n3=scanner.nextDouble();

        soma=n1+n2+n3;
        media=soma/3;

        System.out.println("A soma dos numeros é: "+soma);
        System.out.println("A média dos numeros é "+media);

        scanner.close();
    }
}
