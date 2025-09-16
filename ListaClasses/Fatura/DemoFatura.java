package ListaClasses.Fatura;

import java.util.Scanner;

public class DemoFatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA DE FATURAMENTO ===");
        
        // Criando faturas com dados válidos
        Fatura fatura1 = new Fatura("F001", "Teclado Mecânico", 2, 250.00);
        Fatura fatura2 = new Fatura("F002", "Mouse Gamer", 3, 150.00);
        Fatura fatura3 = new Fatura("F003", "Monitor 24\"", 1, 899.90);
        
        // Exibindo faturas válidas
        System.out.println("\n--- Faturas Válidas ---");
        fatura1.exibirFatura();
        fatura2.exibirFatura();
        fatura3.exibirFatura();
        
        // Testando com valores inválidos
        System.out.println("\n--- Teste com Valores Inválidos ---");
        Fatura faturaInvalida1 = new Fatura("F004", "Headphone", -5, 200.00);
        Fatura faturaInvalida2 = new Fatura("F005", "Webcam", 2, -50.00);
        Fatura faturaInvalida3 = new Fatura("F006", "Microfone", -3, -30.00);
        
        faturaInvalida1.exibirFatura();
        faturaInvalida2.exibirFatura();
        faturaInvalida3.exibirFatura();
        
        // Testando modificações em tempo real
        System.out.println("\n--- Modificações em Tempo Real ---");
        Fatura faturaModificavel = new Fatura("F007", "SSD 500GB", 1, 300.00);
        faturaModificavel.exibirFatura();
        
        // Modificando a quantidade
        System.out.println("\nModificando quantidade para 3:");
        faturaModificavel.setQuantidade(3);
        faturaModificavel.exibirFatura();
        
        // Modificando o preço
        System.out.println("\nModificando preço para 280.00:");
        faturaModificavel.setPrecoUnitario(280.00);
        faturaModificavel.exibirFatura();
        
        // Testando com entrada do usuário
        System.out.println("\n--- Criando Nova Fatura ---");
        System.out.print("Digite o número de identificação: ");
        String id = scanner.nextLine();
        
        System.out.print("Digite a descrição do item: ");
        String descricao = scanner.nextLine();
        
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        
        System.out.print("Digite o preço unitário: ");
        double preco = scanner.nextDouble();
        
        Fatura faturaUsuario = new Fatura(id, descricao, quantidade, preco);
        
        System.out.println("\n--- Fatura Criada ---");
        faturaUsuario.exibirFatura();
        
        scanner.close();
        
        // Demonstrando o método calculaTotal separadamente
        System.out.println("\n--- Demonstração do Método calculaTotal() ---");
        System.out.printf("Total da fatura %s: R$ %.2f\n", 
                         faturaUsuario.getNumeroIdentificacao(), 
                         faturaUsuario.calculaTotal());
    }
}
