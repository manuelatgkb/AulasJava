package modulo1.aula7;
import java.util.*;

public class a7_1_array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List sorteados = new ArrayList();
        ArrayList nomes = new ArrayList(Arrays.asList("Diana", "Eloisa", "Fernanda", "Guilia", "Helena", "Ingride", "Julia"));

        nomes.add("Ana");
        nomes.add("Bia");
        nomes.add("Carla");

        Random random = new Random();
        while (sorteados.size() < 10) {
            int sorteado = random.nextInt(10);
            if (!sorteados.contains(sorteado)) {
                sorteados.add(sorteado);
            }
        }
        for (int i = 0; i <10; i++){
            //System.out.println(nomes.get(sorteados.get(i)));
            };

        }
    }

