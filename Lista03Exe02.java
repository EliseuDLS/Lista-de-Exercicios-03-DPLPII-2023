/* Lista03Exe02: Algoritmo Maçãs - Elaborar um algoritmo em java usando 
métodos que leia o número de maçãs compradas, outro que calcule e outro imprima
o custo total da compra. */

import java.util.Scanner;

public class Lista03Exe02 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        double numeroMacas = 0;
        double precoMacas = 0;
        double calcular = 0;

        numeroMacas = lerNumeroMacas(numeroMacas);

        calcular = calcularCustoTotal(numeroMacas, precoMacas);
        imprimirCustoTotal(calcular);
    }

    public static double lerNumeroMacas(double numeroMacas){

        System.out.println("Cliente, insira o número de maçãs para compra:");
        numeroMacas = LER.nextDouble();

        return numeroMacas;
    }

    public static double calcularCustoTotal(double numeroMacas, double precoMacas){
       
        double calcular = 0;

        if (numeroMacas < 12){
            precoMacas = 1.30;
        } else if (numeroMacas >= 12){
            precoMacas = 1.00;
        }

        calcular = numeroMacas * precoMacas;

        return calcular;
    }

    public static void imprimirCustoTotal(double calcular){
        System.out.println("O custo total (em reais) da sua compra foi de: " + calcular);
    }  
}