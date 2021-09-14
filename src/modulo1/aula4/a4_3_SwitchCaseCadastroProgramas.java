package modulo1.aula4;

import java.util.Scanner;

public class a4_3_SwitchCaseCadastroProgramas {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de filmes, series e documentários");

        System.out.println("Escolha o item a ser cadastrado: \n1 - Filme \t\t\tn2 - Serie \n3 Documentário \t0 - Sair");
        int opt = sc.nextInt();

        switch (opt){
        case 1:
        System.out.println("\t 1 - Cadastrar filme");
        System.out.print("Digite o nome do filme: ");
        String nomeDoFilme = sc.next();
        System.out.print("Descrição do filme: ");
        String descricao = sc.next();
        System.out.print("Digite o gênero do filme: ");
        String genero = sc.next();
        System.out.println("Digite o ano de lançamento: ");
        int ano = sc.nextInt();
        sc.nextLine();

        System.out.println("O filme: "+ nomeDoFilme +" "+ " fala sobre " +descricao+ "É um filme de : "+ genero + " "+ "Foi lançado em:" +ano);
        break;

        case 2:
        System.out.println("\t 2 - Cadastrar serie");
        System.out.print("Digite o nome da serie: ");
        String nomeSerie = sc.next();
        System.out.print("Digite a produtora: ");
        String produtora = sc.next();
        System.out.println("Digite o ano de lançamento: ");
        int anoSerie = sc.nextInt();
        sc.nextInt();

        System.out.println("A serie: "+ nomeSerie +" "+ " produzida por " +produtora+ " "+ "Foi lançada em:" +anoSerie);

        break;

        case 3:
        System.out.println("\t 3 - Cadastrar documentário");
        System.out.print("Digite o nome do documentário: ");
        String nomeDocumentario = sc.next();
        System.out.print("tema: ");
        String tema = sc.next();
        System.out.println("Digite o ano de lançamento: ");
        int anoDocumentário = sc.nextInt();
        sc.nextInt();
        System.out.println("O Documentário" + nomeDocumentario +" "+ " tem como tema " + tema + " "+ "E foi lançado em:" +anoDocumentário);
        break;

        case 0:
        System.out.println("\t 0 - Sair");
        System.out.println("\t\nEscolha uma opção do menu: ");
        int op = sc.nextInt();
        break;

        default:
        System.out.println("Opção invalida");
        break;
        }
    }
}
