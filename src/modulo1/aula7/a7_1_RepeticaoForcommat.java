package modulo1.aula7;

import java.util.Scanner;

public class a7_1_RepeticaoForcommat {
    public static void main(String[] args){

        for (int contador=0; contador<=150; contador++){
            boolean primo = true;
            for(int cont = 2; cont< contador; cont++ ){
                if(contador % cont == 0){
                    primo = false;
            }
        }if(primo){
                System.out.print(contador);
            }
        }
    }
}
