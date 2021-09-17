package modulo1.aula6;

import java.rmi.StubNotFoundException;

public class a6_1_semanalb {
    public static void main(String[] args) {

        String nome = " ";
        String sobrenome = " ";
        byte idade = 0;
        double altura = 1.83;

        System.out.printf(
                // %s == String
                //%d == valores inteiros - int byte, short, long
                // %f == pontos flutuantes - foat, double
                "O nome é %s, o sobrenome %s, a idade %d, e  altura %f",
                nome, sobrenome, idade, altura
        );
    }
}

