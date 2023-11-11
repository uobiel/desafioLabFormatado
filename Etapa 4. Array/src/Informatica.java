public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos, int maxProdutos) {
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        return "Nome da loja: " + this.getNome() +
                " | Quantidade de funcionários: " + this.getQuantidadeFuncionarios() +
                " | Salário base dos funcionários: " + this.getSalarioBaseFuncionario() +
                " | Endereço da loja: " + this.getEndereco() +
                " | Data de fundação da loja: " + this.getDataFundacao() +
                " | Valor do seguro mensal: " + this.seguroEletronicos;
    }
}
