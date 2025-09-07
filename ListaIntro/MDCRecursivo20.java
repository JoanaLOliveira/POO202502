/* Crie uma função recursiva mdc que retorna o máximo divisor comum de m 
e n. O mdc de m e n é definido recursivamente como segue: • se n > m, 
retorne mdc(n, m); • se n = 0, retorne m; • senão, retorne mdc(n, m%n), 
onde % é o operador de resto da divisão. */

/* Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n. */

import java.util.Scanner;

public class MDCRecursivo20 {
    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        }
        if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de m: ");
        int m = scanner.nextInt();
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int resultado = mdc(m, n);
        System.out.println("O MDC de " + m + " e " + n + " é: " + resultado);

        scanner.close();
    }
}
