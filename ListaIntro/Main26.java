/* [FGV - 2023 - AL-MA - Programador - Superior] Analise o código Java a seguir. 
A quantidade de valores que são exibidos na execução desse código é igual a
(a) 0.
(b) 2.
(c) 3.
(d) 5.
(e) 9.
*/

public class Main26 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 4) {
                break;
            } else if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/* RESPOSTA (c) 3.  */