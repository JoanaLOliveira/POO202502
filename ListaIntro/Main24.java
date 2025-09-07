/* [IDECAN - 2023 - Técnico em Tecnologia da Informação] Considere o seguinte 
trecho decódigo escrito na Linguagem Java, considerando a openJDK 17.0.3.

Ao executar este trecho de código qual o resultado mostrado na tela?
(A) 0
(B) 1
(C) 2
(D) 3
(E) error in line 5: invalid operation

*/

public class Main24 {
    public static void main (String[] args) {
        int x, y;
        y = 1;
        x = 1 + ++y;
        System.out.println(x--);
    }
}

/* RESPOSTA (D) 3 */