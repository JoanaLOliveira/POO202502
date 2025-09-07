/* [UFC - 2013 - Analista de Tecnologia da Informação / Engenharia de Software] Considere
o seguinte programa na linguagem Java:

Qual o resultado exibido da execução do programa acima?
(A) 0 e 18
(B) 1 e 19
(C) 6 e 24
(D) 9 e 17
(E) 15 e 23

*/

public class Loop28 {
    public static void main(String[] args) {
        int a, b;
        a=1; b=2;
        while(a<7) {
            a = b+a;
            do {
                b=a+b;
                a=a+1;
            } while(b<9);
        }
        System.out.println(a + " e " + b);
    }
        
}

/* resposta: (E) 15 e 23 */
