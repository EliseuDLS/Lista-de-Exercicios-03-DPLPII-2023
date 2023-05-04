/* Lista03Exe06: Algoritmo IMC - Construa um algoritmo em java usando métodos
para determinar se o indivíduo esta com um peso favorável. Essa situação é determinada
através do IMC (Índice de Massa Corporal), que é definida como sendo a relação entre o
peso (peso) e o quadrado da altura (altura) do indivíduo. Ou seja, IMC = peso / altura2 e, a
situação do peso é determinada pela tabela abaixo:

Condição             Situação
IMC abaixo de 20     Abaixo do peso
IMC de 20 até 25     Peso Normal
IMC de 25 até 30     Sobre Peso
IMC de 30 até 40     Obeso
IMC de 40 e acima    Obeso Mórbido */

import java.util.Scanner; 

public class Lista03Exe06{

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){

        double peso = 0;
        double altura = 0;
        double IMC = 0;
        String condicao = null;

        peso = lerPeso(peso);
        altura = lerAltura(altura);

        condicao = calcularIMC(peso, altura);
        imprimirIMC(condicao);
    }

    public static double lerPeso(double peso){

        System.out.println("Paciente, insira o seu peso: ");
        peso = LER.nextDouble();

        return peso;
    }

    public static double lerAltura(double altura){

        System.out.println("Paciente, insira a sua altura: ");
        altura = LER.nextDouble();

        return altura;
    }

    public static String calcularIMC(double peso, double altura){

        double IMC = peso / Math.pow(altura, 2);
        String condicao = null;

        if (IMC < 20){ // IMC abaixo de 20 -- Abaixo do peso
            condicao = "Abaixo do peso";
        } else if ((IMC >= 20 && IMC < 25)){ // IMC de 20 até 25 -- Peso Normal
            condicao = "Peso normal";
        } else if ((IMC >= 25 && IMC < 30)){ // IMC de 25 até 30 -- Sobre Peso
            condicao = "Sobre peso";
        } else if ((IMC >= 30 && IMC < 40)){ // IMC de 30 até 40 -- Obeso
            condicao = "Obeso";
        } else if (IMC > 40){ // IMC de 40 e acima -- Obeso Mórbido
            condicao = "Obeso mórbido";
        }

        return condicao;
    }

    public static void imprimirIMC(String condicao){
        System.out.println("Sua condição é de: " + condicao);
    }
}