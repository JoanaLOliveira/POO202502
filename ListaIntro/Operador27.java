/* [IFRN - 2009 - Professor - Sistemas de Informação] Analise criteriosamente o código a
seguir e marque a alternativa que corresponde ao respectivo conteúdo de saída após a
execução do programa
(A) | 10 | 9 |
(B) | 10 | 10 |
(C) | 10 | 10.5 |
(D) | 11 | 9 |

*/

public class Operador27 {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        double c = 10.5;
        a = b = (int) c;
        System.out.print(" | " + a++ + " | ");
        if (a++ < 12 || ++b > 5) {
            System.out.print(b + " | ");
        } else {
            System.out.println(c + " | ");
        }
    }
}

/* RESPOSTA: (B) | 10 | 10 | */