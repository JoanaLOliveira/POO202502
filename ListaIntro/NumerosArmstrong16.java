/* Escreva um programa que determine quais são todos os números de 3 
algarismos cuja soma dos cubos de seus algarismos sejam iguais ao próprio
número. • Exemplo: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27. */

public class NumerosArmstrong16 {
    public static void main(String[] args) {
        System.out.println("Números de 3 dígitos cuja soma dos cubos dos algarismos é igual ao número:");

        for (int n = 100; n <= 999; n++) {
            int c = n / 100;          // centena
            int d = (n / 10) % 10;    // dezena
            int u = n % 10;           // unidade

            int somaCubos = (c * c * c) + (d * d * d) + (u * u * u);

            if (somaCubos == n) {
                System.out.println(n);
            }
        }
    }
}
