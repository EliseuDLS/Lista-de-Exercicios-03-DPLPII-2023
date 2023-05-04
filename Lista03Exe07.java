/* Lista03Exe07: Algoritmo Carro - O custo de um carro novo ao consumidor é a soma
do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo
de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
elabore um algoritmo em java usando métodos para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. */

import java.util.Scanner; 

public class Lista03Exe07 { 

    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {

        final float TAXA_DISTRIBUIDOR = 0.28f;
        final float TAXA_IMPOSTO = 0.45f;

        float custoFabrica = 0;
        float valorTaxaDistribuidor = 0;
        float valorTaxaImposto = 0;
        float valorFinalCarro = 0;

        custoFabrica = lerCustoFabrica(custoFabrica);

        valorTaxaDistribuidor = calcularValorTaxaDistribuidor(custoFabrica, TAXA_DISTRIBUIDOR);

        valorTaxaImposto = calcularValorTaxaImposto(custoFabrica, TAXA_IMPOSTO);

        valorFinalCarro = calcularValorFinalCarro(valorTaxaDistribuidor, valorTaxaImposto, custoFabrica);

        imprimirRelatorioVenda(valorTaxaDistribuidor, valorTaxaImposto, valorFinalCarro);

    }

    public static float lerCustoFabrica(float custoFabrica) {

        System.out.println("Custo de Fabricação:");
        custoFabrica = LER.nextFloat(); 

        return custoFabrica;
    }

    public static float calcularValorTaxaDistribuidor(float custoFabrica, final float TAXA_DISTRIBUIDOR) {

        float valorTaxaDistribuidor = 0;
        valorTaxaDistribuidor = (custoFabrica * TAXA_DISTRIBUIDOR);

        return valorTaxaDistribuidor; 
    }

    public static float calcularValorTaxaImposto(float custoFabrica, final float TAXA_IMPOSTO) {

        float valorTaxaImposto = 0;
        valorTaxaImposto = (custoFabrica * TAXA_IMPOSTO);

        return valorTaxaImposto; 
    }

    public static float calcularValorFinalCarro(float valorTaxaDistribuidor, float valorTaxaImposto, float custoFabrica) {

        float valorFinalCarro = 0;
        valorFinalCarro = custoFabrica + valorTaxaDistribuidor + valorTaxaImposto;

        return valorFinalCarro;
    }

    public static void imprimirRelatorioVenda(float valorTaxaDistribuidor, float valorTaxaImposto, float valorFinalCarro) {
        System.out.println("RELATÓRIO DE VENDA");
        System.out.printf("\tValor taxa distribuidor: R$ %.2f\n" , valorTaxaDistribuidor);
        System.out.printf("\tValor taxa impostos: R$ %.2f\n" , valorTaxaImposto);
        System.out.printf("\tValor final: R$ %.2f\n" , valorFinalCarro);
    }
}