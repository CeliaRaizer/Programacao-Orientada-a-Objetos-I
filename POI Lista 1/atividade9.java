package Lista1;
import java.util.Scanner;
/*Faça um programa que leia um número inteiro e diga se ele é primo */
public class atividade9 {
    public static void main(String[] args) {
        int num;
        int div=0;

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num=numero.nextInt();
        
        for (int i=2;i<num;i++)
        {
            if (num%i==0)
            {
                div=1;
                break;
            }
            div=0;
        }
        if (div==0)
        {
            System.out.println("O numero "+num+" e primo");
        }else{
            System.out.println("O numero "+num+" nao e primo");
        }
    }
}
