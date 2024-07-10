/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. Este codigo 
Java solicita dois numeros ao usuario, determina qual 
e o menor e qual e o maior, e entao calcula a soma 
dos numeros impares entre esses dois numeros, excluindo 
o maior. O programa comeca configurando o locale padrao 
para US e inicializando um objeto Scanner para entrada 
de dados. Ele solicita ao usuario que insira dois 
numeros e armazena esses valores nas variaveis menor e 
maior. Em seguida, verifica qual dos dois numeros e o 
menor e, se necessario, troca os valores para garantir 
que menor sempre contenha o menor numero. Usando um loop
while, o programa itera de menor + 1 ate maior - 1. 
Durante cada iteracao, verifica se o numero e impar 
((menor + i) % 2 != 0) e, se for, adiciona esse numero 
a variavel soma_impares. Ao final, o programa exibe a 
soma dos numeros impares calculados. O Scanner e fechado 
ao final para liberar recursos.
*/

import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois numeros: \n");
        int menor = sc.nextInt();
        int maior = sc.nextInt();

        int troca;

        if (menor > maior) {
            troca = menor;
            menor = maior;
            maior = troca;
        }

        int i = 1, soma_impares = 0, controle = 0;

        while (controle != 1) {
            if (maior == (i + menor)) {
                controle = 1;
            } else if ((menor + i) % 2 != 0) {
                soma_impares += menor + i;
            }

            i ++;
        }

        System.out.printf("\nSOMA DOS IMPARES: %d", soma_impares);
        sc.close(); 
    }
}