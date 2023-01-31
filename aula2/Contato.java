package aula2;

import java.util.Scanner;

public class Contato {

    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    // Atributos
    String nome;
    String numeroTelefone;
    String email;
    int idade;
    Endereco endereco;

    //Construtor
    public Contato(){
        System.out.println("\n  -- Registre as informações do Contato --\n");
        System.out.println("Digite o nome: ");
        nome = sc2.nextLine();
        System.out.println("Digite o número de telefone: ");
        numeroTelefone = sc2.nextLine();
        System.out.println("Digite o email: ");
        email = sc2.nextLine();
        System.out.println("Digite a idade: ");
        idade = sc2.nextInt();

        endereco = new Endereco();
    }

    public void exibirContato(){
        System.out.println("\n  -- Informações do Contato --\n");
        System.out.println("Nome: " + nome);
        System.out.println("Número de telefone: " + numeroTelefone);
        System.out.println("Email: " + email);
        System.out.println("Idade: " + idade);
        endereco.exibirEndereco();
    }
}
