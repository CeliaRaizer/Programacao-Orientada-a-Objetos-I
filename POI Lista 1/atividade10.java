package Lista1;
import java.util.Scanner;
//10. Faça um programa que receba dez números inteiros e mostre a quantidade de números
//primos dentre os número que foram digitados.
public class atividade10 {
    public static void main(String[] args) {
        int contPrimos=0;
        int div=0;

        Scanner primo = new Scanner(System.in);

        for (int i=0;i<10;i++)
        {
            System.out.println("Digite o "+(i+1)+"ª numero");
            int num=primo.nextInt();
            div=0;
            for (int j=2;j<num;j++)
            {
                if (num%j==0)
                {
                    div=1;
                    break;
                }
            }
            if (div==0)
            {
                contPrimos++;
            }
        }
        System.out.println("A quantidade de numeros primos e: "+contPrimos);
    }
}
