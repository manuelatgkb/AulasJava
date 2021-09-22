package modulo1.aula10;
import java.util.Scanner;
    public class a10_1cadastroDevMetodos {
        int opcoes;
        public static void main(String[] args) {
            cabecalho();
            escolha_Menu();
            ler_dadosDev();
            ler_dadosLing();
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

        private static void ler_dadosLing() {
            Scanner sc = new Scanner(System.in);
            boolean invalido = true;
            String linguagem = " ";
            String nomeling = " ";
            String descricao = " ";
            String aplicacao = " ";
            do {
                System.out.println("Digite sua opção: " +
                        "\n1 - Front-end" +
                        "\n2 - Back-end" +
                        "\n3 - Mobile ");
                short opcao = sc.nextShort();
                System.out.printf("Você escolheu %d", opcao);
                switch (opcao) {
                    case 1:
                        aplicacao = "Frontend";
                        System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
                        nomeling = sc.next();
                        sc.nextLine();
                        if (nomeling.length() < 3) {
                            System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
                        } else {
                        invalido = false;
                    }
                    while (invalido) ;
                    invalido = true;
                    System.out.printf("\nDigite a descrição da linguagem: ");
                    descricao = sc.next();
                    sc.nextLine();
                    if (descricao.length() < 3) {
                        System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
                    } else {
                        invalido = false;
                    }
                    while (invalido) ;
                    break;
                    case 2:
                        aplicacao = "Backend";
                        System.out.printf("\nDigite o nome da linguagem de %s: ", aplicacao);
                        nomeling = sc.next();
                        sc.nextLine();
                        if (nomeling.length() < 3) {
                            System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
                        } else {
                        invalido = false;
                    }
                    while (invalido) ;
                    invalido = true;
                    System.out.printf("\nDigite a descrição da linguagem: ");
                    descricao = sc.next();
                    sc.nextLine();
                    if (descricao.length() < 3) {
                        System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
                    } else {
                        invalido = false;
                    }
                    break;
                    case 3:
                        aplicacao = "Mobile";
                        System.out.printf("Digite o nome da linguagem de %s: ", aplicacao);
                        nomeling = sc.next();
                        sc.nextLine();
                        if (nomeling.length() < 3) {
                            System.out.println("\nO nome da linguagem deve conter no mínimo 3 letras.");
                        } else {
                        invalido = false;
                    }
                    while (invalido) ;
                    invalido = true;
                    System.out.printf("Digite a descrição da linguagem: ");
                    descricao = sc.next();
                    sc.nextLine();
                    if (descricao.length() < 3) {
                        System.out.println("\nA descrição da linguagem deve conter no mínimo 3 letras.");
                    } else {
                        invalido = false;
                    }
                    break;
                    default:
                        System.out.println("Opção inválida. Digite novamente!");
                        break;
                }
            }while (invalido);
        }
    }






