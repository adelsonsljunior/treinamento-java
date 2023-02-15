package aula4;

import java.util.Scanner;
import java.util.ArrayList;

public class Cliente {
    
    // Atributos

    private String nome;
    private String cpf;

    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    // Construtor

    public Cliente(){
        Scanner sc = new Scanner(System.in);

        System.out.println("    -- Resgistre os dados do Cliente --\n");
        System.out.println("Digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("Digite o cpf do cliente:");
        cpf = sc.nextLine();
    }

    //metédos da classe

    public void exibirCliente(){

        System.out.println("    -- Dados do Produto --\n");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);

        System.out.println("\n    --  CONTAS DO CLIENTE --\n");

        if(contas.isEmpty()){
            System.out.println("O cliente não possui contas cadastradas!");
        } else{
            for (ContaBancaria conta : contas){
                conta.exibirConta();
            }
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(ArrayList<ContaBancaria> contas) {
        this.contas = contas;
    }

}
