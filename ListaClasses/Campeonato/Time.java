/* Escreva uma classe para representar um time de um esporte
qualquer em um campeonato desse esporte. Que atributos devem 
ser representados nessa classe? Quais métodos ela deve conter? 
Escreva um aplicativo de teste que demonstre as capacidades da
classe criada */

package ListaClasses.Campeonato;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String apelido;
    private int fundacao;
    private String cidade;
    private String tecnico;
    private List<String> jogadores;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int pontos;
    private int golsPro;
    private int golsContra;

    /* Construtor */
    public Time(String nome, String apelido, int fundacao,String cidade){
        this.nome = nome;
        this.apelido=apelido;
        this.fundacao=fundacao;
        this.cidade=cidade;
        this.jogadores=new ArrayList<>();
        this.vitorias=0;
        this.derrotas=0;
        this.empates=0;
        this.pontos=0;
        this.golsPro=0;
        this.golsContra=0;
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<String> getJogadores() {
        return jogadores;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public int getPontos() {
        return pontos;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public int getSaldoGols() {
        return golsPro - golsContra;
    }

    public int getJogos() {
        return vitorias + derrotas + empates;
    }

    // Métodos de comportamento
    public void adicionarJogador(String jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(String jogador) {
        jogadores.remove(jogador);
    }

    public void registrarVitoria(int golsPro, int golsContra) {
        this.vitorias++;
        this.pontos += 3;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
    }

    public void registrarDerrota(int golsPro, int golsContra) {
        this.derrotas++;
        this.golsPro += golsPro;
        this.golsContra += golsContra;
    }

    public void registrarEmpate(int gols) {
        this.empates++;
        this.pontos += 1;
        this.golsPro += gols;
        this.golsContra += gols;
    }

    public double getAproveitamento() {
        if (getJogos() == 0) return 0;
        return (pontos * 100.0) / (getJogos() * 3.0);
    }

    public void exibirElenco() {
        System.out.println("Elenco do " + nome + ":");
        for (int i = 0; i < jogadores.size(); i++) {
            System.out.println((i + 1) + ". " + jogadores.get(i));
        }
    }

    public void exibirEstatisticas() {
        System.out.println("Estatísticas do " + nome + ":");
        System.out.println("Jogos: " + getJogos());
        System.out.println("Vitórias: " + vitorias);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Empates: " + empates);
        System.out.println("Pontos: " + pontos);
        System.out.println("Gols Pró: " + golsPro);
        System.out.println("Gols Contra: " + golsContra);
        System.out.println("Saldo de Gols: " + getSaldoGols());
        System.out.printf("Aproveitamento: %.2f%%\n", getAproveitamento());
    }

    @Override
    public String toString() {
        return nome + " (" + apelido + ") - " + cidade + " - Fundado em " + fundacao;
    }

}
