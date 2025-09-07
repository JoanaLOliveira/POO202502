import java.util.Scanner;

public class Fatoriais{
    public static void main(String[] args) {
        int n;
        Scanner leitor = new Scanner (System.in);

        System.out.print("n: ");
        n=leitor.nextInt();

        for (int valor = 0; valor < n; valor++) {
            int fat=1;
            for (int i = valor; i >= 2; i--) {
                fat*=i;
            }
            System.out.println("Fatorial de "+ valor +" = "+ fat);
        }

        leitor.close();
    }
}