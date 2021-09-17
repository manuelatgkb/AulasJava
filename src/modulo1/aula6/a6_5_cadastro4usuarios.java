package modulo1.aula6;

import java.util.Scanner;

public class a6_5_cadastro4usuarios {
    public static void main(String[] args) {
        for (int cont = 1; cont< 5; cont++) {
            Scanner sc = new Scanner(System.in);
            System.out.println(("Cadastro de usuários"));
            System.out.println(("\nBem-vindo ao Cadastro de Usuários"));
            System.out.print("\nDigite o nome do usuário: ");
            String nome = sc.nextLine();
            System.out.printf("%s foi cadatrado. Aguardando próximo cadastro. \n", nome);
        }
    }
}