package modulo1.aula5;
import java.util.Scanner;

public class a5_1_EstruturaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean invalido = true;

        System.out.println("----------Cadastro de Clientes----------");

        System.out.println("Escolha a opção : \n1 - Cadastrar novo cliente \n2 - Listar clientes \n0 - Sair");
        int opt = sc.nextInt();
        sc.nextLine();

        switch (opt) {
            case 1:
                String nomeNovoCliente = " ";
                System.out.println("\n 1 - Cadastrar novo cliente");
                while (invalido) {
                    System.out.print("Digite o nome do cliente: ");
                    nomeNovoCliente = sc.next();
                    if (nomeNovoCliente.length() < 3) {
                        System.out.println("O nome deve ter mais que 3 caracteres");
                        System.out.println("Digite novamente o nome do cliente");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;
                String sobrenomeNovoCliente = " ";
                while (invalido) {
                    System.out.print("Digite o sobrenome do cliente: ");
                    sobrenomeNovoCliente = sc.next();
                    if (nomeNovoCliente.length() < 3) {
                        System.out.println("O sobrenome deve ter mais que 2 caracteres");
                        System.out.println("Digite novamente o sobrenome do cliente");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;
                String rgNovoCliente = " ";
                while (invalido) {
                    System.out.print("Digite o rg do novo cliente: ");
                    rgNovoCliente = sc.nextLine();
                    if (rgNovoCliente.length() < 4) {
                        System.out.println("O rg deve conter, no mínimo, 9 dígitos. ");
                    } else {
                        invalido = false;
                    }
                }
                invalido = true;
                String cpfNovoCliente = " ";
                while (invalido) {
                    System.out.println("Digite o cpf: ");
                    cpfNovoCliente = sc.nextLine();
                    if (cpfNovoCliente.length() > 11){
                        System.out.println("O cpf deve conter, no mínimo, 11 dígitos ");
                    }else{
                        invalido = false;
                    }
                    sc.nextLine();
                }

                System.out.println("Novo cliente: " + nomeNovoCliente + " " + sobrenomeNovoCliente + "rg : " + rgNovoCliente + " " + "cpf:" + cpfNovoCliente);
                break;
            case 2:
                System.out.println("\t 2 - Listar clientes");
                System.out.print("Lista de Clientes: ");
                sc.nextInt();

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
