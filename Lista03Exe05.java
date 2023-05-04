/* Fazer um algoritmo em javausando métodos que receba a idade de um nadador
e determine (imprima) a sua categoria segundo a tabela a seguir:

Categoria    Idade
Infantil A   5 – 7 anos
Infantil B   8 – 10 anos
Juvenil A    11 – 13 anos
Juvenil B    14 – 17 anos
Sênior       Maiores de 18 anos */

import java.util.Scanner; 

public class Lista03Exe05{

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){

        int idade = 0;
        String categoria = null;

        idade = lerIdade(idade);
        categoria = classificarCategoria(idade);
        imprimirCategoria(categoria);
    }

    public static int lerIdade(int idade){

        System.out.println("Competidor, insira sua idade: "); 
        idade = LER.nextInt(); 

        return idade;
    }

    public static String classificarCategoria(int idade){

        String categoria = null;

        if ((idade >= 5 && idade < 7)){
            categoria = "Infantil A";
        } else if ((idade >= 8 && idade < 10)){
            categoria = "Infantil B";
        } else if ((idade >= 11 && idade < 13)){
            categoria = "Juvenil A";
        } else if ((idade >= 14 && idade < 17)){
            categoria = "Juvenil B";
        } else if (idade >= 18){
            categoria = "Sênior";
        }
        
        return categoria;
    }

    public static void imprimirCategoria(String categoria){
        System.out.println("Você pertence a categoria: " + categoria);
    }
}