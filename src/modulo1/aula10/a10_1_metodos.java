package modulo1.aula10;

import java.io.OutputStream;
import java.util.Scanner;

public class a10_1_metodos {
    public static void main(String[] args){
        double num1, num2;

        num1 = ler_numero();
        num2 = ler_numero();
        double r_soma = somar(num1, num2);
        double r_subt = subtrair(num1, num2);
        double r_mult = muliplicar(num1, num2);
        double r_divi = dividir(num1, num2);


        //Apresetação dos resultados
        imprimir_resultado("soma", r_soma);
        imprimir_resultado("subtração", r_subt);
        imprimir_resultado("multiplicação", r_mult);
        imprimir_resultado("divisão", r_divi);

        /*System.out.printf("\n O resultado da soma é %2f ", r_soma);
        System.out.printf("\n O resultado da subtração é %2f ", r_subt);
        System.out.printf("\n O resultado da multiplicação é %2f ", r_mult);
        System.out.printf("\n O resultado da divisão é %2f ", r_divi);*/
    }
    static void imprimir_resultado(String nome_operacao, double resultado){
        System.out.printf("\n O resultado da %s é %2f ", nome_operacao, resultado);

    }
    static double ler_numero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        double numero= Double.parseDouble(sc.nextLine());
        return numero;
    }
    static double somar(double n1, double n2){
        double resultado = n1 + n2;
        return resultado;
    }
    static double subtrair(double n1, double n2){
        double resultado = n1 - n2;
        return resultado;
    }
    static double muliplicar(double n1, double n2){
        double resultado = n1 * n2;
        return resultado;
    }
    static double dividir(double n1, double n2){
        double resultado = n1 / n2;
        return resultado;
    }
}
