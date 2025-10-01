/* Crie um objeto de uma classe chamada Cliente com os atributos id, nome, idade, telefone.
Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList
até que se digite um número de id negativo. Em seguida, exiba os dados de todos os
clientes. */

package Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID do cliente (negativo para sair): ");
            int id = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            if (id < 0) {
                break; // encerra o loop
            }

            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            System.out.print("Digite o telefone: ");
            String telefone = sc.nextLine();

            // Criando e adicionando o cliente
            clientes.add(new Cliente(id, nome, idade, telefone));
            System.out.println("Cliente adicionado com sucesso!\n");
        }

        // Exibindo todos os clientes cadastrados
        System.out.println("\n=== Lista de Clientes Cadastrados ===");
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        sc.close();
    }
}
