/* Escreva um programa que receba um número de 3 dígitos no formato CDU 
(Centena, Dezena e Unidade) e, utilizando operadores aritméticos, 
armazene cada dígito em uma variável de tipo inteiro. Por fim, reescreva 
o número no formato UCD em outra variável de tipo inteiro e o imprima. 
Exemplo: 123 deve ser reescrito como 312. */

// Programa que recebe número de 3 dígitos e reescreve no formato UCD

import java.util.Scanner;

public class InverterCDUparaUCD5 {
    public static void main(String[] args) {
        int numero, c,d,u,novoNumero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 3 digitos (CDU): ");
        numero=scanner.nextInt();

        c=numero/100;
        d=(numero/10)%10;
        u=numero%10;

        novoNumero=(u*100)+(c*10)+d;

        System.out.println("Numero no Formato UCD: "+novoNumero);

        scanner.close();
    }
}
