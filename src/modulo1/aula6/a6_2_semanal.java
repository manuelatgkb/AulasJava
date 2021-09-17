package modulo1.aula6;

public class a6_2_semanal {
    public static void main(String[] args) {

        /*int contador =0;
        while(contador<5){
            System.out.println(contador);
            contador++;
        }
        System.out.printf("O valor final: %d", contador);*/
        int num = 0;

        while (num <= 10) {
            int mult = 0;
            while (mult <= 10) {
                System.out.println(num * mult);
                mult++;

                System.out.println("segundo while");
                int numero2 = 0;
                do {
                    System.out.println(numero2);
                    numero2++;
                } while (numero2 <= 10);
            }
        }
    }
}