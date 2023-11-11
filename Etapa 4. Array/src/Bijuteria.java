public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double metaVendas, int maxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString() {
        return "Nome da loja: " + this.getNome() +
                " | Quantidade de funcionários: " + this.getQuantidadeFuncionarios() +
                " | Salário base dos funcionários: " + this.getSalarioBaseFuncionario() +
                " | Endereço da loja: " + this.getEndereco() +
                " | Data de fundação da loja: " + this.getDataFundacao() +
                " | Meta de vendas mensais: " + this.metaVendas;
    }
}
