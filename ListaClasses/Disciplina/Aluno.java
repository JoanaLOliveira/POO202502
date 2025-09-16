/* Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina da
Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula,
nome, 2 notas de prova (P1 e P2) e 1 nota de trabalho (T). Escreva os seguintes métodos
para esta classe:
• media: calcula a média parcial do aluno (MP)
– cada prova tem peso 2, 5 e o trabalho tem peso 2 (MP =
2,5×P1+2,5×P2+2×T
7
)
• provaF inal: calcula quanto o aluno precisa para o exame final (EF)
– retorna zero se o aluno não necessita realizar o exame final (MP < 3 ou MP >=
7)
– média final MF = (MP × 6 + EF × 4)/10
– é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado
após realizar o exame final
Escreva um aplicativo de teste que demonstre as capacidades da classe criada. */

package ListaClasses.Disciplina;

public class Aluno {
    private String matricula;
    private String nome;
    private double notaP1;
    private double notaP2;
    private double notaT;
    
    // Construtor
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaP1 = 0.0;
        this.notaP2 = 0.0;
        this.notaT = 0.0;
    }
    
    public Aluno(String matricula, String nome, double notaP1, double notaP2, double notaT) {
        this.matricula = matricula;
        this.nome = nome;
        setNotaP1(notaP1);
        setNotaP2(notaP2);
        setNotaT(notaT);
    }
    
    // Métodos getters e setters
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNotaP1() {
        return notaP1;
    }
    
    public void setNotaP1(double notaP1) {
        this.notaP1 = validarNota(notaP1);
    }
    
    public double getNotaP2() {
        return notaP2;
    }
    
    public void setNotaP2(double notaP2) {
        this.notaP2 = validarNota(notaP2);
    }
    
    public double getNotaT() {
        return notaT;
    }
    
    public void setNotaT(double notaT) {
        this.notaT = validarNota(notaT);
    }
    
    // Método para validar notas (entre 0 e 10)
    private double validarNota(double nota) {
        if (nota < 0) return 0.0;
        if (nota > 10) return 10.0;
        return nota;
    }
    
    // Método para calcular a média parcial (MP)
    public double media() {
        // MP = (2.5×P1 + 2.5×P2 + 2×T) / 7
        return (2.5 * notaP1 + 2.5 * notaP2 + 2.0 * notaT) / 7.0;
    }
    
    // Método para calcular quanto precisa no exame final
    public double provaFinal() {
        double mp = media();
        
        // Se MP < 3 ou MP >= 7, não precisa de exame final
        if (mp < 3.0 || mp >= 7.0) {
            return 0.0;
        }
        
        // Calcula a nota mínima necessária no exame final
        // MF = (MP × 6 + EF × 4) / 10 >= 5
        // EF >= (50 - MP × 6) / 4
        double notaMinima = (50.0 - mp * 6.0) / 4.0;
        
        // Se a nota mínima for maior que 10, retorna -1 (indicando impossível)
        if (notaMinima > 10.0) {
            return -1.0;
        }
        
        // Garante que retorne pelo menos 0
        return Math.max(0.0, notaMinima);
    }
    
    // Método para verificar situação do aluno
    public String getSituacao() {
        double mp = media();
        
        if (mp >= 7.0) {
            return "Aprovado";
        } else if (mp < 3.0) {
            return "Reprovado";
        } else {
            double notaNecessaria = provaFinal();
            if (notaNecessaria == -1.0) {
                return "Reprovado (impossível recuperar)";
            } else if (notaNecessaria == 0.0) {
                return "Aprovado";
            } else {
                return String.format("Exame Final (precisa de %.1f)", notaNecessaria);
            }
        }
    }
    
    // Método para exibir informações do aluno
    public void exibirBoletim() {
        System.out.println("=== BOLETIM UFERSA ===");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("P1: %.1f\n", notaP1);
        System.out.printf("P2: %.1f\n", notaP2);
        System.out.printf("T: %.1f\n", notaT);
        System.out.printf("Média Parcial: %.1f\n", media());
        System.out.println("Situação: " + getSituacao());
        System.out.println("======================");
    }
    
    @Override
    public String toString() {
        return String.format("Aluno [%s - %s, MP: %.1f, Situação: %s]", 
                           matricula, nome, media(), getSituacao());
    }
}
