public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[maxProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int maxProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[maxProdutos];
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

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public String toString() {
        return "Nome da loja: " + this.nome +
                " | Quantidade de funcionários: " + this.quantidadeFuncionarios +
                " | Salário base dos funcionários: " + salarioBaseFuncionario +
                " | Endereço da loja: " + this.endereco +
                " | Data de fundação da loja: " + this.dataFundacao +
                " | Quantidade máxima de produtos: " + this.estoqueProdutos.length + " Produtos.";
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

    public void imprimeProdutos() {
        boolean valida = true;
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                System.out.println(estoqueProdutos[i].toString());
                valida = false;
            }
        }
        if (valida) {
            System.out.println("Estoque de produtos vazio.");
        }

    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                int dia = Teclado.leInt("Dia da validade do produto: ");
                int mes = Teclado.leInt("Mês da validade do produto: ");
                int ano = Teclado.leInt("Ano da validade do produto: ");

                Data dataValidade = new Data(dia, mes, ano);

                estoqueProdutos[i] = new Produto(Teclado.leString("Nome do produto: "),
                        Teclado.leDouble("Preço do produto: "), dataValidade);

                return true;
            }
        }

        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        boolean valida = true;
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)) {
                estoqueProdutos[i] = null;
                valida = false;
                return true;
            }
        }

        if (valida) {
            System.out.println("Estoque vazio.");
        }

        return false;
    }

}
