/*  Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção
    relâmpago em dois setores: • No setor de Eletros, que possui código 222,
    todas as peças que custam mais de R$ 500 vão ter 10% de desconto. 
    • No setor de Cama, mesa e banho, que possui código 111, peças com 
    valor acima de R$ 100 vão ter 40% de desconto, peças que custam entre
    R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão ter
    10% de desconto. Escreva um programa que recebe do usuário o código 
    do setor da loja e o valor original de um produto e imprime na tela 
    o nome do setor e o valor do produto com desconto. Caso o usuário 
    forneça um código diferente de 111 ou 222, exiba a mensagem Setor 
    Invalido. */

// Calcula desconto de produtos com base no setor e valor

import java.util.Scanner;

public class PromocaoRelampago8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do setor (111 ou 222): ");
        int codigoSetor = scanner.nextInt();

        System.out.print("Digite o valor do produto: R$ ");
        double valorOriginal = scanner.nextDouble();

        String nomeSetor;
        double valorDesconto;

        if (codigoSetor == 222) {
            nomeSetor = "Eletros";
            if (valorOriginal > 500) {
                valorDesconto = valorOriginal * 0.9; // 10% de desconto
            } else {
                valorDesconto = valorOriginal;
            }
        } else if (codigoSetor == 111) {
            nomeSetor = "Cama, Mesa e Banho";
            if (valorOriginal > 100) {
                valorDesconto = valorOriginal * 0.6; // 40% de desconto
            } else if (valorOriginal >= 50) {
                valorDesconto = valorOriginal * 0.8; // 20% de desconto
            } else {
                valorDesconto = valorOriginal * 0.9; // 10% de desconto
            }
        } else {
            System.out.println("Setor Inválido");
            scanner.close();
            return;
        }

        System.out.println("Setor: " + nomeSetor);
        System.out.printf("Valor com desconto: R$ %.2f\n", valorDesconto);

        scanner.close();
    }
}
