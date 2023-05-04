/* Lista03Exe04: Algoritmo Aposentadoria - Faça um algoritmo em java usando métodos que leia:
o número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na
empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado e
a mensagem 'Requerer aposentadoria' ou 'Não requerer'. */

import java.util.Scanner; 

public class Lista03Exe04{

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){

        int numeroEmpregado = 0;
        int anosTrabalho = 0;
        int anoNascimento = 0;
        int idade = 0;
        int anoIngresso = 0;
        String condicao = null;
        
        numeroEmpregado = lerNumeroEmpregado(numeroEmpregado);
        anoNascimento = lerAnoNascimento(anoNascimento);
        anoIngresso = lerAnoIngresso(anoIngresso);

        condicao = calcularAposentadoria(anoNascimento, anoIngresso);
        imprimirAposentadoria(condicao);
    }

    public static int lerNumeroEmpregado(int numeroEmpregado){

        System.out.println("Empregado, insira seu número (código): "); 
        numeroEmpregado = LER.nextInt(); 

        return numeroEmpregado;
    }

    public static int lerAnoNascimento(int anoNascimento){

        System.out.println("Agora, o ano de seu nascimento: "); 
        anoNascimento = LER.nextInt(); 

        return anoNascimento;
    }
    
    public static int lerAnoIngresso(int anoIngresso){

        System.out.println("E por fim, insira o ano que você ingressou na empresa: "); 
        anoIngresso = LER.nextInt(); 

        return anoIngresso;
    }

    public static String calcularAposentadoria(int anoNascimento, int anoIngresso){

        int idade = (2023 - anoNascimento); // idade em 2023
        int anosTrabalho = (2023 - anoIngresso); // anos de empresa em 2023
        String condicao = null;

        if (idade >= 65){ //Ter no mínimo 65 anos de idade.
            condicao = "É possível requerer aposentadoria!";
        } else if (anosTrabalho >= 30){ //Ter trabalhado no mínimo 30 anos de trabalho.
            condicao = "É possível requerer aposentadoria!";
        } else if (idade >= 60 && anosTrabalho >= 25){ //Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos. 
            condicao = "É possível requerer aposentadoria!";
        } else {
            condicao = "Não é possível requerer aposentadoria!";
        }

        return condicao;
    }
    
    public static void imprimirAposentadoria(String condicao){
       System.out.println(condicao);
    }
}