package unidade1.intro.aula2708;

import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new  Scanner (System.in);

        System.out.print("Informe seu nome: ");
        nome=leitor.nextLine();
    
        System.out.println("Bem vindo(a) "+nome );

        leitor.close();
    }
}
