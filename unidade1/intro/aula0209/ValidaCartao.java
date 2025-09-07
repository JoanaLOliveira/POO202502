package unidade1.intro.aula0209;
import java.util.Calendar;
import java.util.Scanner;

public class ValidaCartao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome,numero,codigo;
        int mes,ano, mesAtual,anoAtual;
        Calendar c=Calendar.getInstance();
        boolean cartaoInvalido;

        mesAtual = c.get(Calendar.MONTH);
        anoAtual=c.get(Calendar.YEAR);

        System.out.println("\t " +mesAtual + " \t " +anoAtual);

        do {
            System.out.println("Informe seu Nome: ");
            nome = leitor.nextLine();
            System.out.println("Informe seu Numero: ");
            numero = leitor.nextLine();
            System.out.println("Informe seu Codigo: ");
            codigo = leitor.nextLine();

            System.out.println("Informe o Mes do seu cartão: ");
            mes = leitor.nextInt();
            System.out.println("Informe o Ano do seu cartão: ");
            ano = leitor.nextInt();

            cartaoInvalido=((ano<anoAtual) || ( ano==anoAtual && mes<mesAtual));
            if (cartaoInvalido) {
                System.out.println("Cartão vencido, inserir dados novamente");
            }
            leitor.nextLine();
        } while (cartaoInvalido);
        System.out.println("Cartão Validado");
        leitor.close();
    }
}
