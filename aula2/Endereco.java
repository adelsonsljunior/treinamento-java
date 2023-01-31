package aula2;

import java.util.Scanner;

public class Endereco {

    Scanner sc = new Scanner(System.in);

    // Atributos
    String cidade;
    String bairro;
    String rua;

    // Construtor
    public Endereco() {
        System.out.println("\n  -- Registre o endereço do Contato --\n");
        System.out.println("Digite o nome da cidade:");
        cidade = sc.nextLine();
        System.out.println("Digite o nome do bairro:");
        bairro = sc.nextLine();
        System.out.println("Digite o nome da rua:");
        rua = sc.nextLine();
    }

    // Métodos
    public void exibirEndereco() {
        System.out.println("\n  -- Endereço do Contato --\n");
        System.out.println("Cidade:" + cidade);
        System.out.println("Bairro:" + bairro);
        System.out.println("Rua:" + rua);
    }
}
