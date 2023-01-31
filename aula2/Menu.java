package aula2;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    Contato[] contatos = new Contato[100];

    public Menu() {

        int opcao = 0;

        do {
            System.out.println("\n--------------------------------------------");
            System.out.println("                     MENU");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Exibir informações de um Contato");
            System.out.println("4 - Atualizar nome do Contato");
            System.out.println("5 - Apagar um Contato");
            System.out.println("6 - Sair");
            System.out.println("--------------------------------------------");
            opcao = sc.nextInt();
            System.out.println("--------------------------------------------\n");

            switch (opcao) {
                case 1:
                    cadastrarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    exibirInformacoesDoContato();
                    break;
                case 4:
                    atualizarContato();
                    break;
                case 5:
                    apagarContato();
                    break;
                case 6:
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

        } while (opcao != 6);
    }

    public void cadastrarContato() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                Contato contato = new Contato();
                contatos[i] = contato;
                System.out.println("\nContato cadastrado com sucesso!");
                break;
            }
        }
    }

    public void listarContatos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                contatos[i].exibirContato();
            }
        }
    }

    public void exibirInformacoesDoContato() {

        System.out.println("Digite o nome do Contato que deseja exibir:");
        String nome = sc2.nextLine();

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].nome.equalsIgnoreCase(nome)) {
                    contatos[i].exibirContato();
                    break;
                }
            }
        }
    }

    public void atualizarContato() {

        System.out.println("Digite o nome do Contato que deseja atualizar:");
        String nome = sc2.nextLine();

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].nome.equalsIgnoreCase(nome)) {
                    System.out.println("\nDigite o novo nome do contato:");
                    String nome2 = sc2.nextLine();
                    contatos[i].nome = nome2;
                    System.out.println("\nContato atualizado com sucesso!");
                    break;
                }
            }
        }
    }

    public void apagarContato() {

        System.out.println("Digite o nome do Contato que deseja apagar:");
        String nome = sc2.nextLine();

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].nome.equalsIgnoreCase(nome)) {
                    contatos[i] = null;
                    System.out.println("\nContato apagado com sucesso!");
                    break;
                }
            }
        }
    }

}
