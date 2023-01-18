import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Usa para todos os tipos, fora String ou char
        Scanner sc2 = new Scanner(System.in); // Só usa com String

        System.out.println("Olá, Mundo!");

        /* Tipos de variáveis 
         * 
         * char     - caracter (uma letra)
         * int      - inteiros
         * float    - reais
         * double   - reais mais precisos
         * boolean  - lógicos (verdadeiro ou falso)
         * String   - cadeia de caracteres (palavras, frases)
        */

        /*int a = 1;
        float b = 1.0f;
        double c = 2.0;
        char d = 'a';
        boolean e = true;
        boolean f = false;
        String g = "uma frase qualquer";

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + a);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);*/

        /*Lendo váriéveis
         * 
         * int: sc.nextInt();
         * float: sc.nextFloat();
         * double: sc.nextDouble();
         * boolean: sc.nextBoolean();
         * String: sc2.next();   // Ler uma palavra (não pode ler)
         * String: sc2.nextLine();   // Ler uma frase (pode ler espaços) 
         */

        /*int idade;
        String nome;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite seu nome: ");
        nome = sc2.nextLine();*/

        /*System.out.println("\nSua idade é: " + idade);
        System.out.println("Seu nome é : " + nome);*/

        /* Condições */

        /*if (idade >= 18){
            System.out.println("\n" + nome + ", você é maior de idade");
        } else {
            System.out.println("\n" + nome + ", você não é maior de idade");
        }*/

        /*System.out.println("Digite um número: ");
        int numero = sc.nextInt();*/

        /*if (numero == 1){
            System.out.println("numero 1");
        } else if(numero == 2){
            System.out.println("numero 2");
        } else if(numero == 3){
            System.out.println("numero 3");
        } else {
            System.out.println("ai ja é demais");
        }*/

        /*switch (numero) {
            case 1:
                System.out.println("numero 1");
                break;
            case 2:
                System.out.println("numero 2");
                break;
            case 3:
                System.out.println("numero 3");
                break;    
            default:
                System.out.println("ai ja é demais");
                break;
        }*/

        /*Laços de repetição */

        /*for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

        /*int x = 10;
        while(x > 0){
            System.out.println(x);
            x--;
        }*/

        /*int y = 0;
        do{
            System.out.println(y);
            y--;
        }while(y > 0);*/

        /* Arrays (vetor)
         * 
         * int[] numeros = new int[5]
         * int[] numeros = {1, 2, 3, 4, 5};
        */

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = sc.nextInt();
        }

        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        /*for each (para cada) */
        for (int numero : numeros) { 
            System.out.println(numero);
        }

        


        







    }

}