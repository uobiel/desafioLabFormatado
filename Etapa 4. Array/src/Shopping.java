public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMaxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public String toString() {
        return "Nome do shopping: " + this.nome +
                "| Endereço do shopping " + this.endereco +
                "| Capacidade de lojas " + this.lojas.length;
    }

    public boolean insereLoja(Loja nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = nomeLoja;
                return true;
            }
        }

        System.out.println("Capacidade máxima atingida. Não é possível inserir mais lojas.");
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }

        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int quantidade = 0;

        for (Loja loja : lojas) {
            if (loja != null) {
                if (loja instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")) {
                    quantidade++;
                } else if (loja instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")) {
                    quantidade++;
                } else if (loja instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")) {
                    quantidade++;
                } else if (loja instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")) {
                    quantidade++;
                } else if (loja instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")) {
                    quantidade++;
                }
            }
        }

        if (quantidade > 0) {
            return quantidade;
        } else {
            return -1; // Nenhum tipo correspondente foi encontrado.
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double maiorSeguro = -1;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;

                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }

        return lojaMaisCara;
    }

}
