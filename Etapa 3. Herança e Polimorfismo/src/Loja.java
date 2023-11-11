public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public String toString() {
        return "Nome da loja: " + this.nome +
                " | Quantidade de funcionários: " + this.quantidadeFuncionarios +
                " | Salário base dos funcionários: " + salarioBaseFuncionario +
                " | Endereço da loja: " + this.endereco +
                " | Data de fundação da loja: " + this.dataFundacao;
    }

    public double gastosComSalario() {

        if (salarioBaseFuncionario == -1) {
            return -1;
        }

        double gastoSalarios = salarioBaseFuncionario * quantidadeFuncionarios;

        return gastoSalarios;

    }

    public char tamanhoDaLoja() {

        if (this.quantidadeFuncionarios < 10) {
            return 'P';
        }

        else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30) {
            return 'M';
        }

        else if (this.quantidadeFuncionarios >= 31) {
            return 'G';
        }

        return '0';
    }

}
