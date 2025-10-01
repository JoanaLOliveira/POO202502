/* Crie uma classe EntradaEmAgenda que contenha:
• os dados necessários para armazenar uma entrada de agenda (hora, dia, mês, ano
e assunto);
• um construtor;
• um método toString;
• um método ehNoDia que recebe valores de dia, mês e ano e retorna true se o dia,
mês e ano daquela instância da classe forem iguais aos argumentos passados.
Crie também uma classe Agenda que:
• encapsule uma agenda de compromissos representada por um ArrayList de instâncias da classe EntradaEmAgenda;
– este item é obrigatório. Caso não seja contemplado, toda a questão será desconsiderada
• implemente um método construtor;
• possua um método para adicionar um novo compromisso à lista de compromissos;
• tenha um método listaDia que recebe valores de dia, mês e ano e lista todas as
instâncias de EntradaEmAgenda que caem naquele dia, mês e ano.
Por fim, escreva uma classe executável que crie uma Agenda, adicione a ela 2 compromissos e, usando o método listaDia, liste as entradas da agenda que tem a mesma da
data do seu aniversário.
 */

package Agenda;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();

        // Adicionando dois compromissos
        minhaAgenda.adicionaCompromisso(new EntradaEmAgenda(10, 1, 10, 2025, "Reunião de trabalho"));
        minhaAgenda.adicionaCompromisso(new EntradaEmAgenda(15, 1, 10, 2025, "Aniversário da Joana"));

        // Substitua pelo dia, mês e ano do seu aniversário
        int diaAniversario = 1;
        int mesAniversario = 10;
        int anoAniversario = 2025; // pode deixar um ano qualquer

        // Listando compromissos do dia do aniversário
        minhaAgenda.listaDia(diaAniversario, mesAniversario, anoAniversario);
    }
}
