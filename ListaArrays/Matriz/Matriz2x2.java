/* Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float
usando um array de duas dimensões. Nesta classe, além do construtor, escreva um
método que calcule o determinante da matriz encapsulada e um método que permita a
impressão em formato matricial dos seus valores. Escreva um aplicativo de teste que
demonstre as capacidades da classe criada.
 */

package Matriz;

public class Matriz2x2 {
    private float[][] matriz; // matriz encapsulada

    // Construtor que recebe os valores
    public Matriz2x2(float a11, float a12, float a21, float a22) {
        matriz = new float[2][2];
        matriz[0][0] = a11;
        matriz[0][1] = a12;
        matriz[1][0] = a21;
        matriz[1][1] = a22;
    }

    // Método que calcula o determinante
    public float determinante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    // Método para imprimir a matriz
    public void imprimir() {
        for (int i = 0; i < 2; i++) {
            System.out.print("| ");
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
