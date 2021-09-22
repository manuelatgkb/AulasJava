package modulo1.aula10;
import java.util.Scanner;

public class a10_1cadastroDevMetodos2 {
    int opcoes;
    public static void main(String[] args) {
        cabecalho();
        escolha_Menu();
        ler_dadosDev();
        opcoes();
        lerCasos();
    }

    static void cabecalho() {
        System.out.println("============ Cadastro de desenvolvedores ============");
    }

    static void escolha_Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua opção: " +
                "\n1 - cadastrar dev;" +
                "\n2 - cadastrar linguagem; " +
                "\n0 - sair ");
        short opcao = sc.nextShort();
    }

    private static void ler_dadosDev() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.println("Digite a senioridade: ");
        String senioridade = sc.nextLine();
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
    }

    static short opcoes(short op1, short op2, short op3) {
        Scanner sc = new Scanner(System.in);
        boolean invalido = true;
        System.out.println("Digite sua opção: " +
                "\n1 - Front-end" +
                "\n2 - Back-end" +
                "\n3 - Mobile ");
        short opcao = sc.nextShort();
        System.out.printf("Você escolheu %d", opcao);
        return opcao;
    }

    static String case1() {
        boolean invalido = true;
        Scanner sc = new Scanner(System.in);
        String aplicacao = "Front-End";
        System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
        String nomeling = sc.next();
        sc.nextLine();
        if (nomeling.length() < 3) {
            System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
        } else {
            invalido = false;
        }
        while (invalido) ;
        invalido = true;
        System.out.printf("\nDigite a descrição da linguagem: ");
        String descricao = sc.next();
        sc.nextLine();
        if (descricao.length() < 3) {
            System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
        } else {
            invalido = false;
        }return aplicacao;
    }

    static String case2() {
        boolean invalido = true;
        Scanner sc = new Scanner(System.in);
        String aplicacao = "Backend";
        System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
        String nomeling = sc.next();
        sc.nextLine();
        if (nomeling.length() < 3) {
            System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
        } else {
            invalido = false;
        }
        while (invalido) ;
        invalido = true;
        System.out.printf("\nDigite a descrição da linguagem: ");
        String descricao = sc.next();
        sc.nextLine();
        if (descricao.length() < 3) {
            System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
        } else {
            invalido = false;
        }return aplicacao;
    }

    static String case3() {
        boolean invalido = true;
        Scanner sc = new Scanner(System.in);
        String aplicacao = "Mobile";
        System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
        String nomeling = sc.next();
        sc.nextLine();
        if (nomeling.length() < 3) {
            System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
        } else {
            invalido = false;
        }
        while (invalido) ;
        invalido = true;
        System.out.printf("\nDigite a descrição da linguagem: ");
        String descricao = sc.next();
        sc.nextLine();
        if (descricao.length() < 3) {
            System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
        } else {
            invalido = false;
        }return aplicacao;

        private static String lerCasos(){
            short opcoes = opcoes();
            switch (opcoes) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente!");
                    break;
            }
        }while (invalido);
    }
}

