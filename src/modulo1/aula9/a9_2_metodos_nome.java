package modulo1.aula9;

public class a9_2_metodos_nome {
    public static void main(String []args){
        //chamando o metodo imprimir_nome e passando dois argumentos do tipo string
        imprimir_nome("Mykon", "Granemann");
    }
    //metodo imprimir_nome que recebe dois parametros string e tem retorno void
    static void imprimir_nome(String nome, String sobrenome){
        System.out.printf("%s %s \n", nome, sobrenome);
    }
}
