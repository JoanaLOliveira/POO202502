/* Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float
usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
demonstre as capacidades da classe criada.
 */

package Matriz;

public class DemoMatriz {
    public static void main(String[] args) {
        // Criando uma matriz 2x2
        Matriz2x2 m = new Matriz2x2(1, 2, 3, 4);

        // Imprimindo a matriz
        System.out.println("Matriz:");
        m.imprimir();

        // Calculando e exibindo o determinante
        System.out.println("Determinante: " + m.determinante());
    }
}
