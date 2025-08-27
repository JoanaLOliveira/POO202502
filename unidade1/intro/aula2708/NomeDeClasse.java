package unidade1.intro.aula2708;

import java.util.Scanner;

public class NomeDeClasse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); /* abre scanner */
        String str = input.next(); /* ate o espaço */
        String str2 = input.nextLine(); /* ate o enter */
        double numd = input.nextDouble();
        int numi=input.nextInt();
        float numf = input.nextFloat();
        System.out.printf("%s %g %d %f %n",str,numd,numi,numf); /* imprimir, %n pula linha no final */
        input.close(); /* fecha scanner */
    }
}
