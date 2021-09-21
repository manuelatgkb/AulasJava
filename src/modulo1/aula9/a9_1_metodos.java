
//Dia 2021-09-21
//Modulo 2 - Aula 9 - Procedimentos, Funções e Métodos
package modulo1.aula9;

import java.util.Enumeration;

public class a9_1_metodos {
    public static void main(String[]args){
        cabecalho();
        soma(10,20);
    }
    static void cabecalho(){
        System.out.println("+++++++++++++Calculadora++++++++++++++++\n");
    }
    static void soma(int numero1, int numero2){
        int soma = numero1 + numero2;
        System.out.printf("A soma de %d e %d é %d", numero1, numero2, soma);
    }
}
