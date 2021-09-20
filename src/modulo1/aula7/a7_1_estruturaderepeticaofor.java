package modulo1.aula7;

import java.util.Scanner;

public class a7_1_estruturaderepeticaofor {
    public static void main(String[] args){
       int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

       while (contador<10){
            contador++;
            System.out.printf(" %s %s" , nome, sobrenome );
        }

        for(int i=0; i<10; i ++){
           System.out.println(nome + " " + sobrenome);
        }
    }
}
