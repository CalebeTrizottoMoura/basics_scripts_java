/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. O programa 
comeca configurando o locale padrao para US e 
inicializando um objeto Scanner para entrada de 
dados. Ele solicita ao usuario a ordem da matriz 
(tamanho) e cria uma matriz quadrada com base nesse 
tamanho. Em seguida, utiliza um loop aninhado para 
iterar sobre cada posicao da matriz, solicitando ao 
usuario que insira os elementos e contando quantos 
elementos sao negativos. Apos preencher a matriz, 
o programa exibe a matriz formatada, linha por linha. 
Em seguida, ele percorre a diagonal principal da 
matriz e exibe os elementos dessa diagonal. A 
contagem de elementos negativos tambem e exibida. 
Ao final, o Scanner e fechado para liberar recursos.
*/

import java.util.Locale;
import java.util.Scanner;

public class ManipulacaoMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int tamanho = sc.nextInt();

        int[][] matriz = new int[tamanho][tamanho];
        int contagem_negativo = 0;

        for (int i = 0; i < tamanho; i ++) {
            for (int j = 0; j < tamanho; j ++) {
                System.out.printf("Elemento [%d, %d]: ", i, j);
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] < 0) {
                    contagem_negativo ++;
                }
            }
        }

        int p = 0;
        System.out.print("\nMATRIZ\n");

        while (p < tamanho) {
            for (int j = 0; j < tamanho; j ++) {
                if (j == tamanho - 1) {
                    System.out.printf("%d\n", matriz[p][j]);
                } else {
                    System.out.printf("%d   ", matriz[p][j]);
                }
            }

            p ++;
        }

        System.out.print("\nDIAGONAL PRINCIPAL: ");
        
        for (int i = 0; i < tamanho; i ++) {
            for (int j = 0; j < tamanho; j ++) {
                if (i == j) {
                    if (i == tamanho - 2) {
                        System.out.printf("%d e ", matriz[i][j]);
                    } else if (i == tamanho - 1) {
                        System.out.printf("%d", matriz[i][j]);
                    } else {
                        System.out.printf("%d, ", matriz[i][j]);
                    }
                }
            }
        }

        System.out.printf("\nQUANTIDADE DE NEGATIVOS: %d", contagem_negativo);
        sc.close(); 
    }
}