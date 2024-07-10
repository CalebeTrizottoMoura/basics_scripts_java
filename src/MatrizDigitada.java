/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. Este codigo 
Java permite que o usuario defina as dimensoes de uma 
matriz (numero de linhas e colunas) e depois preencha 
os elementos dessa matriz manualmente. O programa 
comeca inicializando um objeto Scanner para entrada de 
dados. Em seguida, solicita ao usuario quantas linhas 
e colunas a matriz tera e cria a matriz com base nessas 
dimensoes. Utilizando loops aninhados, o programa 
solicita ao usuario que insira cada elemento da matriz, 
exibindo a posicao do elemento conforme e solicitado. 
Apos preencher a matriz, o programa a exibe na tela, 
linha por linha, mostrando os elementos digitados pelo 
usuario. Ao final, o Scanner e fechado para liberar 
recursos.
*/

import java.util.Scanner;

public class MatrizDigitada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas irao ter a sua matriz? ");
        int lin_mat = sc.nextInt();

        System.out.print("Quantas colunas irao ter a sua matriz? ");
        int col_mat = sc.nextInt();

        int[][] matriz = new int[lin_mat][col_mat];

        for (int i = 0; i < lin_mat; i++) {
            for (int j = 0; j < col_mat; j++) {
                System.out.print("Elemento [" + i + ", " + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMATRIZ DIGITADA");
        for (int i = 0; i < lin_mat; i++) {
            for (int j = 0; j < col_mat; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }

        sc.close();
    }
}