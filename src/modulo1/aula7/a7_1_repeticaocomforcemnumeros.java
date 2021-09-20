package modulo1.aula7;

public class a7_1_repeticaocomforcemnumeros {
    public static void main(String[] args){

        for (int contador=0; contador<=100; contador++){
            boolean par = true;
            for(int cont = 1; cont = contador+cont; cont++ ){
                if(contador = cont+2){
                    par = false;
                }
            }if(par){
                System.out.print(contador);
            }
        }
    }
}
}
