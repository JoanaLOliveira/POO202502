package unidade1.intro.aula0309;

import java.util.Scanner;

public class FatorialRecursiva {
    public static void main(String[] args) {
        int num, fat;
        Scanner leitor = new Scanner(System.in);

        System.out.println("num: ");
        num=leitor.nextInt();
        fat=fatorial(num);

        System.out.println("Fatorial (" + num +") = "+fat);
    }
}
