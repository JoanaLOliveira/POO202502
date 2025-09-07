/* Escreva um programa que receba um ângulo em graus e o converta para 
sua representação em radianos. Divulgue também seno, cosseno, tangente, 
cossecante, secante e cotangente do ângulo. */

// Programa que converte graus em radianos e mostra as razões trigonométricas

import java.util.Scanner;

public class AnguloTrigonometria3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();
        
        // CORREÇÃO: Converter graus para radianos (não o contrário)
        double rad = Math.toRadians(graus);
        
        double seno = Math.sin(rad);
        double cos = Math.cos(rad);
        double tg = Math.tan(rad);
        
        // Usando Double para permitir valores nulos
        Double csc = (Math.abs(seno) > 1e-10) ? 1.0 / seno : null;
        Double sec = (Math.abs(cos) > 1e-10) ? 1.0 / cos : null;
        Double cotg = (Math.abs(tg) > 1e-10) ? 1.0 / tg : null;
        
        System.out.println("\nÂngulo em radianos: " + rad);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cos);
        System.out.println("Tangente: " + tg);
        
        System.out.println("Cossecante: " + (csc != null ? csc : "indefinida"));
        System.out.println("Secante: " + (sec != null ? sec : "indefinida"));
        System.out.println("Cotangente: " + (cotg != null ? cotg : "indefinida"));
        
        scanner.close();
    }
}