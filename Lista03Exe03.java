/* Lista03Exe03: Algoritmo Classificação Eleitoral - 
Crie um algoritmo em java usando métodos que leia a idade de uma pessoa 
e informe  a sua classe eleitoral:
        - não eleitor (abaixo de 16 anos);
        - eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
        - eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive). */

import java.util.Scanner; 

public class Lista03Exe03 {

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        int idade = 0;
        String classeEleitoral = null;

        idade = lerIdade(idade);

        classeEleitoral = classificarEleitor(idade);

        imprimirClasseEleitoral(classeEleitoral);
    }

    public static int lerIdade(int idade) {

        System.out.println("Usuário, insira sua idade: "); 
        idade = LER.nextInt(); 

        return idade; 
    }

    public static String classificarEleitor(int idade) {

        String classeEleitoral = null;

        if (idade < 16) {
            classeEleitoral = "não eleitor";
        } else if ((idade >= 16 && idade < 18) || (idade >= 65)) {
            classeEleitoral = "eleitor facultativo";
        } else if (idade >=18 && idade < 65){
            classeEleitoral = "eleitor obrigatório";
        }

        return classeEleitoral; 
    }

    public static void imprimirClasseEleitoral(String classeEleitoral) {
        System.out.println("Sua Classe Eleitoral é de: " + classeEleitoral); 
    }
}