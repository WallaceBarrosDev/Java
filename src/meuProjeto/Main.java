package meuProjeto;

public class Main {
    public static void main(String[] args){
        char dia = 'Q';
        switch (dia) {
            case 'D':
                System.out.println("Domingo");
            break;

            case 's':
                System.out.println("Segunda-feira");
            break;

            case 't':
                System.out.println("Terça-feira");
            break;

            case 'q':
                System.out.println("Quarta-feira");
            break;

            case 'Q':
                System.out.println("Quinta-feira");
            break;

            case 'S':
                System.out.println("Sexta-feira");
            break;

            case 'A':
                System.out.println("Sabado");
            break;
            default:
                System.out.println("valor invalido");
        }
    }
}
