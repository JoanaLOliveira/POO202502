/* Escreva um programa que lê três números e determina qual número é 
o menor. */

// Programa que lê três números e mostra o menor

import java.util.Scanner;

public class MenorDeTres7 {
    public static void main(String[] args) {
        float n1,n2,n3,menor;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1=scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        n2=scanner.nextFloat();
        
        System.out.println("Digite o terceiro número: ");
        n3=scanner.nextFloat();

        // Lógica correta para encontrar o menor
        menor = n1; // Assume que n1 é o menor inicialmente
                
        if (n2 < menor) {
            menor = n2; // Se n2 for menor, atualiza
        }

        if (n3 < menor) {
            menor = n3; // Se n3 for menor, atualiza
        }

        System.out.println("O menor numero é: "+menor);

        scanner.close();
    }
    
}