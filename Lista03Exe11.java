/* Lista03Exe11: Algoritmo Zodíaco - Crie um algoritmo em java usando
métodos chamado classificarZodiaco. Este algoritmo deve ler a data do seu
aniversário e atribuir um valor para a variável chamada signo. */

import java.util.Scanner; 

public class Lista03Exe11{

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args){
        
        int mes = 0;
        int dia = 0;
        String signo = null;

        mes = lerMes(mes);
        dia = lerDia(dia);
        signo = classificarZodiaco(mes, dia);
        imprimirZodiaco(signo);
    }

    public static int lerMes(int mes){
        System.out.println("Olá, insira o mês do seu aniversário: ");
        mes = LER.nextInt();

        return mes;
    }

    public static int lerDia(int dia){
        System.out.println("Agora, insira o dia do seu aniversário: ");
        dia = LER.nextInt();

        return dia;
    }

    public static String classificarZodiaco(int mes, int dia){

        String signo = null;

        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)){ // (21/janeiro a 19/fevereiro)
            signo = "Aquário";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)){ // (20/fevereiro a 20/março)
            signo = "Peixes";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)){ // (21/março a 20/abril)
            signo = "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)){ // (21/abril a 20/maio)
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)){ // (21/maio a 20/junho)
            signo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 21)){ // (21/junho a 21/julho)
            signo = "Câncer";
        } else if ((mes == 7 && dia >= 22) || (mes == 8 && dia <= 22)){ // (22/julho a 22/agosto)
            signo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)){ // (23/agosto a 22/setembro)
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)){ // (23/setembro a 22/outubro)
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)){ // (23/outubro a 21/novembro)
            signo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)){ // (22/novembro a 21/dezembro)
            signo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 10)){ // (22/dezembro a 20/janeiro)
            signo = "Capricórnio";
        }

        return signo;
    }

    public static void imprimirZodiaco(String signo){
        System.out.println("Você é do seguinte signo do zodíaco: " + signo);
    }
}