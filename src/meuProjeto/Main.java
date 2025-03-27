package meuProjeto;

public class Main {
    public static void main(String[] args){
        int contador = 0;

        while (contador < 10){
            System.out.println(++ contador);
        }

        contador = 0;

        do {
            System.out.println(++ contador);
        } while (contador < 10);

        for (int i = 0; i <= contador; i++) {
            System.out.println(i);
        }
    }
}
