public class Principal {
    public static void main(String[] args) {
        Principal principal = new Principal();

        while (true) {

            int quest = Teclado.leInt("\n[1] Criar uma loja\n[2] Criar um produto\n[3] Sair\n");

            if (quest == 1) {
                System.out.println("\n");
                principal.separaLinha();
                System.out.println("Criar uma loja");
                principal.separaLinha();

                Endereco endereco = new Endereco(Teclado.leString("\nNome da rua: \n"),
                        Teclado.leString("\nNome da cidade: \n"), Teclado.leString("\nNome do estado: \n"),
                        Teclado.leString("\nNome do país: \n"), Teclado.leString("\nCEP do estabelecimento: \n"),
                        Teclado.leString("\nNúmero do estabelecimento: \n"), Teclado.leString("\nComplemento: \n"));

                Data data = new Data(Teclado.leInt("\nDia da fundação da loja: \n"),
                        Teclado.leInt("\nMês da fundação da loja: \n"), Teclado.leInt("\nAno da funcação da loja: \n"));

                Loja loja = new Loja(Teclado.leString("\nDigite o nome da loja: \n"),
                        Teclado.leInt("\nDigite a quantidade de funcionário da loja: \n"),
                        Teclado.leDouble("\nDigite o salário base dos funcionários: \n"), endereco, data,
                        Teclado.leInt("Qual o máximo de produtos da loja? "));

            }

            else if (quest == 2) {
                System.out.println("\n");
                principal.separaLinha();
                System.out.println("Criar um produto");
                principal.separaLinha();

                Data data = new Data(Teclado.leInt("\nData de validade do produto: \n"),
                        Teclado.leInt("\nMês de validade do produto: \n"),
                        Teclado.leInt("\nAno de validade do produto: \n"));

                Produto produto = new Produto(Teclado.leString("\nNome do produto: \n"),
                        Teclado.leDouble("\nPreço do produto: \n"), data);

                if (produto.estaVencido(new Data(20, 10, 2023)) == true) {
                    System.out.println("\n");
                    principal.separaLinha();
                    System.out.println("PRODUTO VENCIDO");
                    principal.separaLinha();
                }

                else {
                    System.out.println("\n");
                    principal.separaLinha();
                    System.out.println("PRODUTO NÃO VENCIDO");
                    principal.separaLinha();
                }
            }

            else if (quest == 3) {
                System.out.println("\n");
                principal.separaLinha();
                System.out.println("Saindo...");
                principal.separaLinha();
                break;
            }

            else {
                System.out.println("\nOpção inválida\n");
            }

        }

    }

    public void separaLinha() {
        System.out.println("==================================================");
    }
}
