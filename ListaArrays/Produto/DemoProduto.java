/* Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para um método produto utilizando uma lista de argumentos de comprimento variável.
Escreva também uma classe executável que teste seu método com várias chamadas,
cada uma com um número diferente de argumentos. */


package Produto;

public class DemoProduto {
    public static void main(String[] args) {
        // Testando com diferentes quantidades de argumentos
        System.out.println("Produto de (2, 3): " + Util.produto(2, 3));
        System.out.println("Produto de (1, 2, 3, 4): " + Util.produto(1, 2, 3, 4));
        System.out.println("Produto de (5): " + Util.produto(5));
        System.out.println("Produto de (10, 2, -1): " + Util.produto(10, 2, -1));
        System.out.println("Produto de ( ): " + Util.produto()); // sem argumentos
    }
}
