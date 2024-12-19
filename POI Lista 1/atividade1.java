package Lista1;
import java.util.Scanner;
/*Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada.
Calcule e mostre o salário a receber seguindo estas regras:
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto */
public class atividade1 {

    public static void main(String[] args){
        
        int horas=0;
        float valHora=0;
        float salBruto;
        float sal;
        float imposto;

        Scanner atividade1 = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas: ");
         horas = atividade1.nextInt();
         //System.out.println("horas: "+horas);

        System.out.printf( "Digite o valor da hora: ");
        valHora = atividade1.nextFloat();
        //System.out.println("salario bruto: "+salBruto);

        salBruto= (horas*valHora);
        imposto=salBruto*30/100;

        System.out.println( "O Salario bruto e: "+salBruto);
        System.out.println("O salario a receber e: "+(salBruto-imposto));
    }
}