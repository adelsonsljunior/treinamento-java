package aula4;

import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {

    // Atributos
    
    private int numero;
    private double saldo;

    // Conastrutor

    public ContaBancaria(){

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Random random = new Random();
        
        numero = random.nextInt(1000);
        double valorInicial = 0;

        System.out.println("\n    -- Criando Conta --");

        System.out.println("Deseja depositar um valor inicial ? |S - sim / N - não|");
        String resp = sc2.next();

        if(resp.equalsIgnoreCase("S")){
            System.out.println("\nDigite o valor inicial:");
            valorInicial = sc.nextDouble();
        }

        saldo = valorInicial;
        
    }

    //metédos da classe

    public void exibirConta(){

        System.out.println("    -- Dados da Conta --\n");
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        System.out.println("\nDeposito realizado com sucesso!");
    }

    public void sacar(double valor){

        double resultado = saldo - valor;
        
        if (resultado >= 0){
            saldo = resultado;
            System.out.println("\nSaque realizado com sucesso!");

        } else{
            System.out.println("\nO saque dessa quantia resultada em um saldo negativo!");
        }
    }

    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
