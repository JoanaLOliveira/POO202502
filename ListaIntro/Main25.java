/* [FADE - UFPE - 2023 - UFPE - Analista de Tecnologia da Informação - 
Área: Sistemas] Considere o seguinte código em Java:

A execução desse código resulta na impressão do seguinte valor:
(A) 13
(B) 8
(C) 10
(D) 9
(E) 12

*/


public class Main25 {
    public static void main(String[] args) {
        System.out.println(proc(5));
    }
    public static int proc(int k) {
        if (k > 0) return proc(k - 2) + proc(k - 1);
        return 1;
    }
}

/* RESPOSTA  (A) 13 */