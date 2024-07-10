/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. O programa 
comeca configurando o locale padrao para US e 
inicializando um objeto Scanner para entrada de dados. 
Ele solicita e armazena informacoes da primeira pessoa 
(nome, idade, sexo e salario) usando metodos de 
entrada especificos para cada tipo de dado. Apos 
coletar os dados da primeira pessoa, ele limpa o 
buffer do Scanner e solicita e armazena as informacoes 
da segunda pessoa da mesma maneira. Finalmente, o 
programa exibe os detalhes formatados de ambas as 
pessoas, incluindo nome, idade, sexo e salario, usando 
formatacao para exibir o salario com duas casas 
decimais. O Scanner e fechado ao final para liberar
recursos.
*/

import java.util.Locale;
import java.util.Scanner;

public class DetalhesPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double salario1, salario2;
        int idade1, idade2;
        char sexo1, sexo2;

        System.out.println("<<< Primeira Pessoa >>>");
        System.out.print("Digite o nome: ");
        nome1 = sc.nextLine();

        System.out.print("Digite a idade: ");
        idade1 = sc.nextInt();

        System.out.print("Digite o sexo (F/M): ");
        sexo1 = sc.next().charAt(0);

        System.out.print("Digite o salario: ");
        salario1 = sc.nextDouble();

        System.out.println("\n<<< Segunda Pessoa >>>");
        System.out.print("Digite o nome: ");
        sc.nextLine(); //limpar buffer
        nome2 = sc.nextLine();

        System.out.print("Digite a idade: ");
        idade2 = sc.nextInt();

        System.out.print("Digite o sexo (F/M): ");
        sexo2 = sc.next().charAt(0);
        
        System.out.print("Digite o salario: ");
        salario2 = sc.nextDouble();

        System.out.println("\n<<< Dados da Primeira Pessoa >>>");
        System.out.println("O colaborador " + nome1 + " de " + idade1 + 
                            " anos, do sexo " + sexo1 + ", recebe a quantia de R$ " + 
                            String.format("%.2f", salario1) + " ao mes.");

        System.out.println("\n<<< Dados da Segunda Pessoa >>>");
        System.out.println("O colaborador " + nome2 + " de " + idade2 + 
                            " anos, do sexo " + sexo2 + ", recebe a quantia de R$ " + 
                            String.format("%.2f", salario2) + " ao mes.");
        
        sc.close();
    }
}