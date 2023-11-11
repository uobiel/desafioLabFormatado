public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int maxProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString() {
        return "Nome da loja: " + this.getNome() +
                " | Quantidade de funcionários: " + this.getQuantidadeFuncionarios() +
                " | Salário base dos funcionários: " + this.getSalarioBaseFuncionario() +
                " | Endereço da loja: " + this.getEndereco() +
                " | Data de fundação da loja: " + this.getDataFundacao() +
                " | Taxa de Comercialização: " + this.taxaComercializacao;
    }

}
