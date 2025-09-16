package ListaClasses.Disciplina;

import java.util.Scanner;

public class DemoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== SISTEMA ACADÊMICO UFERSA ===");
        
        // Criando alunos com diferentes situações
        Aluno aluno1 = new Aluno("20230001", "João Silva", 8.5, 7.8, 9.0); // Aprovado
        Aluno aluno2 = new Aluno("20230002", "Maria Santos", 4.0, 5.0, 6.0); // Exame Final
        Aluno aluno3 = new Aluno("20230003", "Pedro Costa", 2.0, 3.0, 4.0); // Reprovado
        Aluno aluno4 = new Aluno("20230004", "Ana Oliveira", 9.5, 8.0, 9.8); // Aprovado
        Aluno aluno5 = new Aluno("20230005", "Carlos Lima", 1.5, 2.0, 1.0); // Reprovado
        
        // Exibindo boletins dos alunos
        System.out.println("\n--- BOLETINS DOS ALUNOS ---");
        aluno1.exibirBoletim();
        aluno2.exibirBoletim();
        aluno3.exibirBoletim();
        aluno4.exibirBoletim();
        aluno5.exibirBoletim();
        
        // Testando o método provaFinal especificamente
        System.out.println("\n--- CÁLCULO DO EXAME FINAL ---");
        testarProvaFinal(aluno2);
        testarProvaFinal(aluno1);
        testarProvaFinal(aluno3);
        
        // Testando com entrada do usuário
        System.out.println("\n--- CADASTRO DE NOVO ALUNO ---");
        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a nota da P1: ");
        double p1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da P2: ");
        double p2 = scanner.nextDouble();
        
        System.out.print("Digite a nota do Trabalho: ");
        double t = scanner.nextDouble();
        
        Aluno novoAluno = new Aluno(matricula, nome, p1, p2, t);
        
        System.out.println("\n--- BOLETIM DO NOVO ALUNO ---");
        novoAluno.exibirBoletim();
        
        // Demonstração detalhada do cálculo
        System.out.println("\n--- DETALHES DO CÁLCULO ---");
        System.out.printf("MP = (2.5×%.1f + 2.5×%.1f + 2×%.1f) / 7 = %.1f\n",
                         novoAluno.getNotaP1(), novoAluno.getNotaP2(), novoAluno.getNotaT(),
                         novoAluno.media());
        
        scanner.close();
        
        // Testando casos limite
        System.out.println("\n--- TESTES DE CASOS LIMITE ---");
        Aluno alunoLimite1 = new Aluno("20230006", "Teste Limite", 6.9, 6.9, 6.9);
        Aluno alunoLimite2 = new Aluno("20230007", "Teste Limite 2", 3.0, 3.0, 3.0);
        Aluno alunoLimite3 = new Aluno("20230008", "Teste Limite 3", 7.0, 7.0, 7.0);
        
        alunoLimite1.exibirBoletim();
        alunoLimite2.exibirBoletim();
        alunoLimite3.exibirBoletim();
    }
    
    // Método auxiliar para testar o provaFinal
    private static void testarProvaFinal(Aluno aluno) {
        double notaNecessaria = aluno.provaFinal();
        if (notaNecessaria == 0.0) {
            System.out.printf("%s: Não precisa de exame final\n", aluno.getNome());
        } else if (notaNecessaria == -1.0) {
            System.out.printf("%s: Impossível ser aprovado no exame final\n", aluno.getNome());
        } else {
            System.out.printf("%s: Precisa de %.1f no exame final\n", 
                             aluno.getNome(), notaNecessaria);
        }
    }
}
