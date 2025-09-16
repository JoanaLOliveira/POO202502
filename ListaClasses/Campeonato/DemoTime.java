package ListaClasses.Campeonato;

public class DemoTime {
    public static void main(String[] args) {
        Time time1=new Time("VASCO", "CAI CAI",1895 , "RJ");
        time1.setTecnico("Tite");
        time1.adicionarJogador("Gabriel Barbosa");
        time1.adicionarJogador("Bruno Henrique");
        time1.adicionarJogador("Everton Ribeiro");
        
        Time time2 = new Time("Palmeiras", "Verdão", 1914, "São Paulo");
        time2.setTecnico("Abel Ferreira");
        time2.adicionarJogador("Raphael Veiga");
        time2.adicionarJogador("Dudu");
        time2.adicionarJogador("Endrick");
        
        // Simulando resultados
        time1.registrarVitoria(3, 1);
        time1.registrarEmpate(2);
        time1.registrarVitoria(4, 0);
        time1.registrarDerrota(1, 2);
        
        time2.registrarVitoria(2, 0);
        time2.registrarVitoria(1, 0);
        time2.registrarEmpate(1);
        time2.registrarEmpate(0);
        
        // Exibindo informações
        System.out.println("=== INFORMAÇÕES DOS TIMES ===");
        System.out.println(time1);
        System.out.println(time2);
        
        System.out.println("\n=== ESTATÍSTICAS ===");
        time1.exibirEstatisticas();
        System.out.println();
        time2.exibirEstatisticas();
        
        System.out.println("\n=== ELENCOS ===");
        time1.exibirElenco();
        System.out.println();
        time2.exibirElenco();
        
        // Comparando times
        System.out.println("\n=== COMPARAÇÃO ===");
        if (time1.getPontos() > time2.getPontos()) {
            System.out.println(time1.getNome() + " está na frente no campeonato!");
        } else if (time2.getPontos() > time1.getPontos()) {
            System.out.println(time2.getNome() + " está na frente no campeonato!");
        } else {
            if (time1.getSaldoGols() > time2.getSaldoGols()) {
                System.out.println(time1.getNome() + " está na frente no campeonato por saldo de gols!");
            } else if (time2.getSaldoGols() > time1.getSaldoGols()) {
                System.out.println(time2.getNome() + " está na frente no campeonato por saldo de gols!");
            } else {
                System.out.println("Os times estão empatados em pontos e saldo de gols!");
            }
        }
    }
}
    