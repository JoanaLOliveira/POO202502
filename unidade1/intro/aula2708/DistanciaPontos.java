package unidade1.intro.aula2708;

import java.util.Scanner;

public class DistanciaPontos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x1,y1,x2,y2,dist;

        System.out.print("Informe o valor de X1: ");
        x1 = leitor.nextDouble();
        System.out.print("Informe o valor de Y1: ");
        y1 = leitor.nextDouble();
        System.out.print("Informe o valor de X2: ");
        x2 = leitor.nextDouble();
        System.out.print("Informe o valor de Y2: ");
        y2 = leitor.nextDouble();

        /* raiz ((x1-x2)^2+(y1-y2)^2) */
        dist= Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        System.out.printf("A distancia entre (%g,%g) e (%g,%g) eh %g\n", x1,y1, x2,y2, dist);

        leitor.close();
    }
}
