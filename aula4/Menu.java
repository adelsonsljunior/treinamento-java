package aula4;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    private ArrayList<Cliente> clientes = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    public Menu() {

        int opc = 0;

        do {

            System.out.println("\n--------------------------------------------");
            System.out.println("                     MENU");
            System.out.println("--------------------------------------------");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Conta de Cliente");
            System.out.println("4 - Exibir Cliente Específico");
            System.out.println("5 - Depositar");
            System.out.println("6 - Sacar");
            System.out.println("7 - Sair");
            System.out.println("--------------------------------------------");
            opc = sc.nextInt();
            System.out.println("--------------------------------------------\n");

            switch (opc) {
                case 1:
                    cadastrarCliente();
                    break;

                case 2:
                    if (clientes.isEmpty()) {
                        vazio();
                    } else {
                        listarClientes();
                    }
                    break;

                case 3:
                    if (clientes.isEmpty()) {
                        vazio();
                    } else {
                        cadastrarConta();
                    }
                    break;

                case 4:
                    if (clientes.isEmpty()) {
                        vazio();
                    } else {
                        exibirCliente();
                    }
                    break;

                case 5:
                    if (clientes.isEmpty()) {
                        vazio();
                    } else {
                        depositar();
                    }
                    break;

                case 6:
                    if (clientes.isEmpty()) {
                        vazio();
                    } else {
                        sacar();
                    }
                    break;

                case 7:
                    System.out.println("----------------");
                    System.out.println("   SAINDO");
                    System.out.println("----------------\n");
                    break;

                default:
                    System.out.println("-----------------------");
                    System.out.println("   OPCAO INVALIDA");
                    System.out.println("-----------------------\n");
                    break;
            }

        } while (opc != 7);
    }

    private void vazio() {
        System.out.println("------------------------------------");
        System.out.println("   NÃO HÁ CLIENTES CADASTRADOS");
        System.out.println("----------------------------------\n");
    }

    private void cadastrarCliente() {
        Cliente cliente = new Cliente();
        clientes.add(cliente);
    }

    private void listarClientes() {

        for (Cliente cliente : clientes) {
            cliente.exibirCliente();
        }
    }

    private void cadastrarConta() {

        System.out.println("Digite o nome do cliente:");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                ContaBancaria conta = new ContaBancaria();
                clientes.get(i).getContas().add(conta);
                break;
            }

        }
    }

    private void exibirCliente() {

        System.out.println("Digite o nome do cliente:");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                clientes.get(i).exibirCliente();
                break;
            }

        }
    }

    private void depositar() {

        System.out.println("Digite o nome do cliente:");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("\nDigite o número da conta: ");
                int numero = sc.nextInt();

                for (int j = 0; j < clientes.get(i).getContas().size(); j++) {
                    if (clientes.get(i).getContas().get(j).getNumero() == numero) {

                        System.out.println("\nDigite o valor que deseja depositar: ");
                        double valor = sc.nextDouble();
                        clientes.get(i).getContas().get(j).depositar(valor);
                        break;
                    }
                }

                break;
            }

        }
    }

    private void sacar() {

        System.out.println("Digite o nome do cliente:");
        String nome = sc2.nextLine();

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equalsIgnoreCase(nome)) {
                System.out.println("\nDigite o número da conta: ");
                int numero = sc.nextInt();

                for (int j = 0; j < clientes.get(i).getContas().size(); j++) {
                    if (clientes.get(i).getContas().get(j).getNumero() == numero) {

                        System.out.println("\nDigite o valor que deseja depositar: ");
                        double valor = sc.nextDouble();
                        clientes.get(i).getContas().get(j).sacar(valor);
                        break;
                    }
                }

                break;
            }

        }
    }

}
