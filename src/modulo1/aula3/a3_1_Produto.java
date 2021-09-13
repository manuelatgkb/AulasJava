package modulo1.aula3;

import java.util.Scanner;

public class a3_1_Produto {
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Cadastro de produtos"));
        System.out.println(("Bem-vindo ao Cadastro de Produtos"));

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a descrição do produto : ");
        String descrição = scanner.nextLine();

        System.out.print("Digite o valor do produto : ");
        float valor = scanner.nextFloat();

        System.out.print("Digite a categoria do produto : ");
        String categoria = scanner.nextLine();

        System.out.println("O produto : " + nome + " " + categoria +" " + "foi registrado");
    }
}
