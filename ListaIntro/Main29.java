/* [VUNESP - 2023 - EsFCEx - Oficial do Quadro Complementar] A seguir é apresentado
um trecho de código escrito na linguagem Java.

É correto afirmar que o valor impresso será
(A) 25
(B) 8
(C) 4
(D) 7
(E) 26
*/

public class Main29 {
    public static void main(String[] args) {
        int x;
        x = 10 * 2 % 3 + 5;
        System.out.println( "Valor:" + x++);
    }
}

/* RESPOSTA: (D) 7 */