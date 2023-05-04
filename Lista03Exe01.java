/* Lista03Exe01: Algoritmo Dia da semana – Elaborar um algoritmo em java usando
métodos para ler um número que representa o dia da semana, em seguida imprimir a
qual dia o número se refere. 
Exemplo: 4 = “Quarta-feira”. */

import java.util.Scanner;

public class Lista03Exe01 { 


    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int dia = 0;
        String diaSemana = null;

        dia = lerDia(dia);

        diaSemana = classificarDiaSemana(dia);

        imprimirDiaSemana(dia, diaSemana);

    }

    public static int lerDia(int dia) {

        System.out.println("Olá, insira um dia da semana qualquer: "); 
        dia = LER.nextInt(); 

        return dia;
    }

    public static String classificarDiaSemana(int dia) {

        String diaSemana = null;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
        }
        return diaSemana;
    }

    public static void imprimirDiaSemana(int dia, String diaSemana) {
        System.out.println(dia + " = " + diaSemana); 
    }
}