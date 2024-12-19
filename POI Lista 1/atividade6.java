package Lista1;
import java.util.Scanner;
//6. Faça um programa que leia um número e calcule o fatorial desse número 
public class atividade6 {
    public static void main(String[] args) {
        int num;
        int fatorial=1;

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero para calcular o fatorial: ");
        num=numero.nextInt();

        for(int i = 1; i <= num; i++) {
            fatorial*= i;
        }

        System.out.println("O fatorial de "+num+" e "+fatorial);
    }
    
}
