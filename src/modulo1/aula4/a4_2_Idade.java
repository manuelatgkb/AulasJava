package modulo1.aula4;

import java.util.Scanner;

public class a4_2_Idade {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println(("Cadastro de pessoas"));
        System.out.println(("Cadastro Exclusivo de Maiores de Dezoito Anos"));

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        if(idade >= 18){
            System.out.println("O nome e sobrenome digitado foi: "+ nome +" "+ sobrenome + " " + idade + "anos de idade");
        }else {
            System.out.println("O Cadastro é efetuado apenas em caso de maioridade. Menores de dezoito anos não podem se cadastrar");
        }
    }
}
