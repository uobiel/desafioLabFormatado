public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados, int maxProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString() {
        return "Nome da loja: " + this.getNome() +
                " | Quantidade de funcionários: " + this.getQuantidadeFuncionarios() +
                " | Salário base dos funcionários: " + this.getSalarioBaseFuncionario() +
                " | Endereço da loja: " + this.getEndereco() +
                " | Data de fundação da loja: " + this.getDataFundacao() +
                " | Roupas importadas: " + this.produtosImportados;
    }
}
