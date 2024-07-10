/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. O programa 
comeca configurando o locale padrao para US e 
inicializando um objeto Scanner para entrada de dados. 
Ele solicita e armazena o nome e idade da primeira 
pessoa, e em seguida faz o mesmo para a segunda pessoa. 
Para evitar problemas com a quebra de linha apos a 
leitura de numeros, e usada uma chamada sc.nextLine() 
apos sc.nextInt() para limpar o buffer do scanner antes 
de ler a proxima linha de entrada. Apos obter os dados 
de ambas as pessoas, o programa calcula a idade media 
usando a formula ((idade1 + idade2) / 2.0) e exibe o 
resultado formatado com uma casa decimal. Ao final, o 
Scanner e fechado para liberar recursos.
*/

import java.util.Locale;
import java.util.Scanner;

public class IdadeMediaTexto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();

        System.out.print("Idade: ");
        int idade1 = sc.nextInt();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome2 = sc.nextLine();

        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        System.out.printf("A idade media de %s e %s e igual a %.1f anos.", nome1, nome2, (((double)idade1 + idade2) / 2));

        sc.close(); 
    }
}