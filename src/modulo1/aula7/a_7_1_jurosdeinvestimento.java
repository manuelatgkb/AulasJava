package modulo1.aula7;

public class a_7_1_jurosdeinvestimento {
    public static void main(String[]args){
        double investimento = 5000, taxaJuros = 0.02, acresMes = 0.0;
        int qtdMeses = 24;

        for (int i = 0; i<qtdMeses; i++){
            acresMes = investimento * taxaJuros;
            investimento += acresMes;
            System.out.printf("%d mês : Reais %.2f \n", i+1, investimento);
        }
    }
}
