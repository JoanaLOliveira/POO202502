package ListaClasses.Fatura;

public class Fatura {
    private String numeroIdentificacao;
    private String descricao;
    private int quantidade;
    private double precoUnitario;
    
    // Construtor
    public Fatura(String numeroIdentificacao, String descricao, int quantidade, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        setQuantidade(quantidade); // Usa o setter para validar
        setPrecoUnitario(precoUnitario); // Usa o setter para validar
    }
    
    // Métodos getters e setters
    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }
    
    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        // Se a quantidade não for positiva, configura como 0
        this.quantidade = (quantidade > 0) ? quantidade : 0;
    }
    
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    
    public void setPrecoUnitario(double precoUnitario) {
        // Se o preço por item não for positivo, configura como 0.0
        this.precoUnitario = (precoUnitario > 0.0) ? precoUnitario : 0.0;
    }
    
    // Método para calcular o total da fatura
    public double calculaTotal() {
        return quantidade * precoUnitario;
    }
    
    // Método para exibir informações da fatura
    public void exibirFatura() {
        System.out.println("=== FATURA ===");
        System.out.println("Nº Identificação: " + numeroIdentificacao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço Unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Total: R$ %.2f\n", calculaTotal());
        System.out.println("==============");
    }
    
    @Override
    public String toString() {
        return String.format("Fatura [ID: %s, Desc: %s, Qtd: %d, Preço: R$ %.2f, Total: R$ %.2f]",
                           numeroIdentificacao, descricao, quantidade, precoUnitario, calculaTotal());
    }
}
