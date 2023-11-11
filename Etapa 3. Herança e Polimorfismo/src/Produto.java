public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Nome do produto: " + this.nome +
                " | Preço do produto: R$" + this.preco +
                " | Data de validade: " + this.dataValidade;
    }

    public boolean estaVencido(Data data) {

        if (dataValidade.getAno() > data.getAno()) {
            return false;
        }

        else if (dataValidade.getAno() == data.getAno() && dataValidade.getMes() > data.getMes()) {
            return false;
        }

        else if (dataValidade.getAno() == data.getAno() && dataValidade.getMes() == data.getMes()
                && dataValidade.getDia() >= data.getDia()) {
            return false;
        }

        return true;
    }

}
