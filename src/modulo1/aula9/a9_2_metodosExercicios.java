package modulo1.aula9;
import java.util.Scanner;

public class a9_2_metodosExercicios {
    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            double n1, n2;

            cabecalho();
            imprime_menu();
            escolha_menu();
            soma();
            subtracao();
            divisao();
            multiplicacao();

        }

        static void cabecalho() {
            System.out.println("+++++++++++++Calculadora que lê valores tipo double++++++++++++++++\n");
        }

        static void imprime_menu() {
            System.out.println("Menu");
            System.out.println("\t1Soma");
            System.out.println("\t2Subtração");
            System.out.println("\t3Divisão");
            System.out.println("\t4Multiplicação");
            System.out.println("\t0Sair");
        }

        static void escolha_menu() {
            double op = ler_numero("Siga as orientações do menu : ");
            double n1 = 0, n2 = 0, r = 0;
            if (op > 0) {
                n1 = ler_numero("Digite o primeiro número: ");
                n2 = ler_numero("Digite o segundo número: ");
            }
            System.out.printf("O resultado das operações é %f: ", r);
        }

        static double ler_numero(String mensagem) {
            System.out.print(mensagem);
            double numero = Double.parseDouble(sc.nextLine());
            return numero;
        }
        //operações:

        static void soma(double numero1, double numero2) {
            double resultado = numero1 + numero2;
            return resultado;
        }

        static void subtracao(double numero1, double numero2) {
            double resultado = numero1 - numero2;
            return resultado;
        }

        static void divisao(double numero1, double numero2) {
            double resultado = numero1 / numero2;
            return resultado;
        }

        static void multiplicacao(double numero1, double numero2) {
            double resultado = numero1 * numero2;
            return resultado;
        }

    }
