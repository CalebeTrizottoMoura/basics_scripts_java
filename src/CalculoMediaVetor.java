/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. O codigo 
em Java solicita ao usuario quantos numeros deseja 
digitar, cria um vetor com base nessa entrada 
e, em seguida, solicita e armazena os valores 
fornecidos pelo usuario. Ele calcula a soma total dos 
numeros inseridos e, usando esses valores, calcula a 
media. Apos a entrada dos dados, o programa exibe os 
numeros digitados em uma linha formatada, seguida 
pela soma e media calculadas, ambos exibidos com duas 
casas decimais. O Scanner utilizado para entrada e 
fechado ao final para liberar recursos.
*/

import java.util.Locale;
import java.util.Scanner;

public class CalculoMediaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce ira digitar? ");
        int tamanho = sc.nextInt();

        float[] vetor = new float[tamanho];
        float soma = 0;

        for (int i = 0; i < tamanho; i ++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            vetor[i] = sc.nextFloat();
            soma += vetor[i];
        }

        System.out.print("\nVALORES: ");
        for (int i = 0; i < tamanho; i ++) {
            if (i == (tamanho - 2)) {
                System.out.printf("%.1f e ", vetor[i]);
            } else if (i == (tamanho - 1)) {
                System.out.printf("%.1f", vetor[i]);
            } else {
                System.out.printf("%.1f, ", vetor[i]);
            } 
        }

        float media = soma / tamanho;

        System.out.printf("\nSOMA: %.2f\n", soma);
        System.out.printf("MEDIA: %.2f\n", media);

        sc.close(); 
    }
}