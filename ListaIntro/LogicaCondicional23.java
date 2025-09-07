/* . [UFPR - 2023 - IF-PR - Informática] Assinale a alternativa correspondente 
à saída que será apresentada na tela ao executar o código abaixo, inserindo 
como entrada o valor 5 para a média e 0,75 para frequência. */

import java.util.Scanner;

public class LogicaCondicional23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre a media, de 0 a 10: ");
        float media_aluno=input.nextFloat();
        System.out.println("Entre com a frequencia de 0 a 1 (indicando 100%): ");
        float frequencia=input.nextFloat();
        float media=7;
        float frequencia_minima=0.75f;
        if (media_aluno >= media && frequencia >= frequencia_minima) {
            System.out.println("Voce foi aprovado!");
        } else if (media_aluno >= media) {
            System.out.println("Solicite aprovacao mediante justificativa de faltas.");
        } else if (frequencia >= frequencia_minima) {
            float recuperar = media * 2 - media_aluno;
            if (recuperar <= 10){
                System.out.println("Esta em recuperacao, tirar no minimo " + recuperar);
            } else{
                System.out.println("Nao esta apto para recuperacao.");
            }
        } else {
            System.out.println("Voce esta reprovado.");
        }
    }    
}

/* (A) Você foi aprovado!
(B) Solicite aprovação mediante justificativa de faltas.
(C) Está em recuperação, tirar no mínimo 9.0
(D) Não está apto para recuperação.
(E) Você está reprovado. */

/* resposta (C) Está em recuperação, tirar no mínimo 9.0 */