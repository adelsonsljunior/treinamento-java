package aula3;

import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private Scanner sc2 = new Scanner(System.in);

    private Produto[] produtos = new Produto[100];
    private Cliente[] clientes = new Cliente[100];

    public Menu() {

        int opc = 0;

        do {

            System.out.println("\n--------------------------------------------");
            System.out.println("                     MENU");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Cadastrar Cliente");
            System.out.println("4 - Listar Clientes");
            System.out.println("5 - Pesquisar Cliente");
            System.out.println("6 - Atualizar nome do Cliente");
            System.out.println("7 - Apagar Cliente");
            System.out.println("8 - Comprar Produto");
            System.out.println("9 - Sair");
            System.out.println("--------------------------------------------");
            opc = sc.nextInt();
            System.out.println("--------------------------------------------\n");

            switch (opc) {
                case 1:
                    cadastarProduto();
                    break;

                case 2:
                    listarProdutos();
                    break;

                case 3:
                    cadastrarCliente();
                    break;

                case 4:
                    listarClientes();
                    break;

                case 5:
                    pesquisarCliente();
                    break;

                case 6:

                    atualizarCliente();
                    break;

                case 7:
                    apagarCliente();
                    break;

                case 8:

                    break;

                case 9:
                    System.out.println("\n----------------------");
                    System.out.println("        SAINDO");
                    System.out.println("----------------------\n");
                    break;

                default:
                    System.out.println("\n----------------------");
                    System.out.println("    OPÇÃO INVÁLIDA");
                    System.out.println("----------------------\n");
                    break;
            }

        } while (opc != 8);

    }

    private void cadastarProduto() {

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null) {
                Produto produto = new Produto();
                produtos[i] = produto;
                break;
            }
        }
    }

    private void listarProdutos() {

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                produtos[i].exibirProduto();
            }
        }
    }

    private void cadastrarCliente() {

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                Cliente cliente = new Cliente();
                clientes[i] = cliente;
                break;
            }
        }
    }

    private void listarClientes() {

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                clientes[i].exibirCliente();
            }
        }
    }

    private void pesquisarCliente() {

        System.out.println("Digite o nome do cliente: ");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i] != null) {
                if (clientes[i].getNome().equalsIgnoreCase(nome)) {

                    clientes[i].exibirCliente();
                }
            }
        }
    }

    private void atualizarCliente() {

        System.out.println("Digite o nome do cliente: ");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i] != null) {
                if (clientes[i].getNome().equalsIgnoreCase(nome)) {

                    System.out.println("\nDigite o novo nome do cliente:");
                    String nome2 = sc2.nextLine();

                    clientes[i].setNome(nome2);
                }
            }
        }
    }

    public void apagarCliente() {

        System.out.println("Digite o nome do cliente: ");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i] != null) {
                if (clientes[i].getNome().equalsIgnoreCase(nome)) {

                    clientes[i] = null;

                }
            }
        }
    }

    public void comprarProduto() {

        System.out.println("Digite o nome do cliente: ");
        String nomeC = sc2.nextLine();

        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i] != null && clientes[i].getNome().equalsIgnoreCase(nomeC)) {

                System.out.println("\nDigite o nome do produto: ");
                String nomeP = sc2.nextLine();

                for (int j = 0; j < produtos.length; j++) {

                    if (produtos[i] != null && produtos[j].getNome().equalsIgnoreCase(nomeP)) {

                        Produto produto = produtos[j];

                        for (int k = 0; k < clientes[i].getProdutos().length; k++) {
                            if (clientes[i].getProdutos()[k] == null) {
                                clientes[i].getProdutos()[k] = produto;
                                break;
                            }
                        }
                        
                        break;
                    }
                }

                break;
            }
        }
    }

}
