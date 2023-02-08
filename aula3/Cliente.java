package aula3;

import java.util.Scanner;

public class Cliente {

    // Atributos

    private String nome;
    private String telefone;
    private Produto[] produtos = new Produto[100];

    // Construtor

    public Cliente() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("    -- Resgistre os dados do Cliente --\n");
        System.out.println("Digite o nome do cliente: ");
        nome = sc2.nextLine();
        System.out.println("Digite o telefone do cliente:");
        telefone = sc2.nextLine();

    }

    public void exibirCliente(){

        System.out.println("    -- Dados do Produto --\n");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone " + telefone);

        System.out.println("    -- PRODUTOS DO CLIENTE --\n");

        for (Produto produto : produtos){
            produto.exibirProduto();
        }
        
    }

    // Métodos get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }


}
