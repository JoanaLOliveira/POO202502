/* Escreva um aplicativo que calcula o produto de uma série de inteiros que são passados
para um método produto utilizando uma lista de argumentos de comprimento variável.
Escreva também uma classe executável que teste seu método com várias chamadas,
cada uma com um número diferente de argumentos. */

package Produto;

public class Util {
    // Método que calcula o produto usando varargs
    public static int produto(int... numeros) {
        int resultado = 1;

        for (int n : numeros) {
            resultado *= n;
        }

        return resultado;
    }
}
