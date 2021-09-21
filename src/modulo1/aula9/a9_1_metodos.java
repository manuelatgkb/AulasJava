
//Dia 2021-09-21
//Modulo 2 - Aula 9 - Procedimentos, Funções e Métodos
package modulo1.aula9;

import java.util.Scanner;

public class a9_1_metodos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        cabecalho();
        imprime_menu();
        escolha_menu();
    }

    static void cabecalho(){
        System.out.println("+++++++++++++Calculadora++++++++++++++++\n");
    }
    static void imprime_menu(){
        System.out.println("Menu");
        System.out.println("\t1Soma");
        System.out.println("\t2Subtração");
        System.out.println("\t3Divisão");
        System.out.println("\t4Multiplicação");
        System.out.println("\t0Sair");
    }
        static void escolha_menu(){
            int op = ler_numero("Digite uma opção do menu : ");
            int n1=0, n2=0, r=0;

            if(op>0){
                n1=ler_numero("Digite o primeiro número: ");
                n2=ler_numero("Digite o segundo número: ");
            }
            switch (op){
                case 1: //soma
                    r=soma(n1, n2);
                    break;
                case 2: //subtração
                    r = subtracao(n1, n2);
                    break;
                case 3: //divisão
                    r=divisao(n1, n2);
                    break;
                case 4:
                    r=multiplicacao(n1, n2);
                    break;
                case 0: //sair
                    return;
            }
            System.out.printf("O resultado da operação é %d: ", r);
    }
        static int ler_numero(String mensagem){
            System.out.print(mensagem);
            int numero = Integer.parseInt(sc.nextLine());
            return numero;
        }
        //operações:

        static int soma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    static int subtracao(int numero1, int numero2) {
        int resultado = numero1 - numero2;
        return resultado;
    }
    static int divisao(int numero1, int numero2){
        int resultado = numero1 / numero2;
        return resultado;
    }

    static int multiplicacao(int numero1, int numero2) {
        int resultado = numero1 * numero2;
        return resultado;
    }

}
