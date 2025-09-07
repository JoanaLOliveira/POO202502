package unidade1.intro.aula0209;
import java.util.Calendar;
import java.util.Scanner;

public class ValidaCartao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int num,cod,mes,ano, mesAtual,anoAtual;
        Calendar calendario=Calendar.getInstance();
        boolean dataInvalida;

        mesAtual = 1+calendario.get(Calendar.MONTH);
        anoAtual=calendario.get(Calendar.YEAR);

        System.out.print("Nome: ");
        nome=leitor.nextLine();
        System.out.print("Numero: ");
        num=leitor.nextInt();
        System.out.print("Codigo: ");
        cod=leitor.nextInt();

        do {
            System.out.print("Informe o Mes do seu cartão: ");
            mes = leitor.nextInt();
            System.out.print("Informe o Ano do seu cartão: ");
            ano = leitor.nextInt();

            dataInvalida=((ano<anoAtual) || ( ano==anoAtual && mes<mesAtual));
            if (dataInvalida) {
                System.out.println("Cartão vencido, inserir dados novamente");
            }
            leitor.nextLine();
        } while (dataInvalida);
        System.out.println("Cartão Validado");
        leitor.close();
    }
}
