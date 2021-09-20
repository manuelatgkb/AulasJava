package modulo1.aula7;

import java.util.Scanner;

public class a7_1_atividadeDupla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de números pares, ímpares, primos e cálculo de juros");

        System.out.println("Escolha o item a ser cadastrado: \n1 - pares \n2 - ímpares \n3 primos \n4 cálculoJuros \n5 - Sair");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println("\t 1 - Pares");
                System.out.print("Digite o número: ");
                int pares = sc.nextInt();
                sc.nextInt();
                for (int contador=0; pares<=100; contador++){
                    if(contador %2 == 0){
                        System.out.print(pares);
                        break;

            case 2:
                System.out.println("\t 1 - Ímpares");
                System.out.print("Digite o número: ");
                int impares = sc.nextInt();
                sc.nextInt();
                for (int contador=0; impares<=100; contador++){
                    if(contador %2 == 0){
                        System.out.print(impares);

                break;

            case 3:
                System.out.println("\t 1 - Primos");
                System.out.print("Digite o número: ");
                int primos = sc.nextInt();
                sc.nextInt();
                for (int primo=1; primos<=primo; primo++){
                    if(contador %2 == 0){
                        System.out.print(primos);
                break;

            case 4:
                System.out.println("\t 1 - CalculoJuros");
                System.out.print("Digite o número: ");
                int calculoJuros = sc.nextInt();
                sc.nextInt();
                for (int contador=0; calculoJuros<=100; contador++){
                    if(contador %2 == 0){
                        System.out.print(calculoJuros);
                break;

                        case 5:
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