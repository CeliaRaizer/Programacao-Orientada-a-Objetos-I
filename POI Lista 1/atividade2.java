package Lista1;
import java.util.Scanner;
/*2. Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência */
public class atividade2 {
    public static void main(String[]args){
        float salMin;
        int quilowatt;
        float valorQuilo=0;
        float valorTotal=0;

        Scanner atividede2 = new Scanner(System.in);

        System.out.println("Digite o valor do salario minimo: ");
        salMin=atividede2.nextFloat();
        System.out.println("Digite a quantidade de quilowatts consumida: ");
        quilowatt=atividede2.nextInt();

        valorQuilo=(salMin*1/100);
        valorTotal=quilowatt*valorQuilo;

        System.out.println("O valor de cada quilowatts e: "+valorQuilo);
        System.out.println("O valor a ser pago e: "+valorTotal);

    }    
}
