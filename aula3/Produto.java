package aula3;

import java.util.Scanner;

public class Produto {

    // Atributos

    private String nome;
    private double preco;
    private String marca;

    // Construtor

    public Produto(){

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("    -- Resgistre os dados do Produto --\n");
        System.out.println("Digite o nome do produto: ");
        nome = sc2.nextLine();
        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();
        System.out.println("Digite o nome da marca do produto:");
        marca = sc2.nextLine();
        
    }

    // Métodos da classe

    public void exibirProduto(){

        System.out.println("    -- Dados do Produto --\n");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Marca: " + marca);
   
    }

    // Get e set

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

}
