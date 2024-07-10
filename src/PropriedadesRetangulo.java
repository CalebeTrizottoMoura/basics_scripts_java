/*
Resumo e script desenvolvidos sem o uso de caracteres 
especiais para garantir compatibilidade. O codigo Java 
solicita ao usuario que insira a base e a altura de um 
retangulo, calcula a area multiplicando os dois valores, 
o perimetro como a soma dos lados e a diagonal usando o 
teorema de Pitagoras. Em seguida, exibe os resultados 
formatados com quatro casas decimais para area, 
perimetro e diagonal.
*/

import java.util.Locale;
import java.util.Scanner;

public class PropriedadesRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura retangulo: ");
        double altura = sc.nextDouble();

        double area = altura * base;
        double perimetro = (2 * altura) + (2 * base);
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("\nAREA = %.4f\n", area);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);
        
        sc.close(); 
    }
}