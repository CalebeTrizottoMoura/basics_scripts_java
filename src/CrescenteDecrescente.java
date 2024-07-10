/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. Este 
codigo em Java solicita ao usuario que insira dois 
numeros. Ele verifica se os numeros sao iguais. Se 
nao forem iguais, o programa continuara solicitando 
que o usuario insira novos pares de numeros ate 
que numeros iguais sejam inseridos, momento em que 
o programa encerra a execucao. Durante cada 
iteracao, o programa compara os dois numeros e 
imprime "DECRESCENTE!" se o primeiro numero for 
maior que o segundo, "CRESCENTE!" se o primeiro 
numero for menor que o segundo, e encerra se os 
numeros forem iguais. O Scanner e fechado ao final 
para liberar recursos.
*/

import java.util.Locale;
import java.util.Scanner;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira dois numeros iguais para sair.\n");
        System.out.print("Digite dois numeros: \n");
        int primeiro = sc.nextInt();
        int segundo = sc.nextInt();
        
        int x = 0, controle = 0;

        while (x != 1) {
            if (controle != 0) {
                System.out.print("Digite outros dois numeros: \n");
                primeiro = sc.nextInt();
                segundo = sc.nextInt();
            }

            if (primeiro > segundo) {
                System.out.print("DECRESCENTE!\n");
            } else if (primeiro < segundo) {
                System.out.print("CRESCENTE!\n");
            } else {
                x = 1;
            }

            controle ++;
        }
    
        sc.close(); 
    }
}