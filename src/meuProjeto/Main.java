package meuProjeto;

public class Main {
    public static void main(String[] args){
        // operador or, and, not
        
        int a, b = 0;
        boolean condicao = false;
        a = 1; b = 2;

        // and 
        condicao = a < b && b < a;
        System.out.println(condicao);

        // or
        condicao = a < b || a == b;
        System.out.println(condicao);

        // not
        condicao = a == 1;
        System.out.println(condicao);
        System.out.println(!condicao);
    }
}
