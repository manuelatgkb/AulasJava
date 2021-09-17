package modulo1.aula5;

import java.util.Scanner;

public class a5_1_while {
    public static void main(String[] args) {
           System.out.printf("Cadastro das devs Manu e Raissa\n");
            Scanner sc = new Scanner(System.in);
            System.out.printf("\t 1 -Cadastrar Dev");
            System.out.printf("\t 2 -Cadastrar linguagem");
            System.out.printf("\t 0 -Sair\n");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    boolean invalido = true;

                    do {
                        System.out.println("Digite seu nome: ");
                        String nome = sc.nextLine();
                        if (nome.length() < 3) {
                            System.out.println("O nome deve ter mais que 3 caracteres");
                            System.out.println("Digite novamente o nome");
                        } else {
                            invalido = false;
                        }
                    } while (invalido);


                    String sobrenome;
                    do {
                        System.out.println("Digite seu sobrenome: ");
                        sobrenome = sc.nextLine();
                        if (sobrenome.length() < 3) {
                            System.out.println("O sobrenome deve ter mais que 3 caracteres");
                            System.out.println("Digite novamente o sobrenome");
                        } else {
                            invalido = false;
                        }
                    } while (invalido);

                    invalido = true;

                    System.out.println("Digite sua senioridade: ");
                    String senioridade = sc.nextLine();

                    invalido = true;
                    do {
                        System.out.println("Digite sua idade: ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        if (idade <= 0) {
                            System.out.println("A idade tem que ser maior que ZERO");
                            System.out.println("Digite a idade novamente");
                        }else{
                            invalido = false;
                        }
                    }while (invalido);
                    System.out.println("Cadastro realizado com sucesso");

                    break;

                case 0:
                    System.out.printf("Sair");
                    sc.nextLine();
                break;
            }
    }
}