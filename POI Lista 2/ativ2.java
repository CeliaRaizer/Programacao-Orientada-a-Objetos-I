/*2. Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores */
import java.util.Scanner;
public class ativ2 {
    public static void main(String[] args) {
        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[20];
        int cont=0;

        Scanner num = new Scanner(System.in);
       
        for(int i=0;i<10;i++)
        {
            System.out.print("Digite o "+(i+1)+" valor do 1 vetor: ");
            vet1[i]= num.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.print("Digite o "+(i+1)+" valor do 2 vetor: ");
            vet2[i]= num.nextInt();
        }

        for(int i=0;i<10;i++)
        {
            boolean verifica = false;
            for (int j=0;j<10;j++)
            {
                if (vet1[i]==vet2[j]){
                    verifica = true;
                    break;
                }
            }
            if (!verifica){
                vet3[cont]=vet1[i];
                cont++;
            }
        }
       
        for(int i=0;i<10;i++)
        {
            boolean verifica = false;
            for (int j=0;j<10;j++)
            {
                if (vet2[i]==vet1[j]){
                    verifica = true;
                    break;
                }
            }
            if (!verifica){
                vet3[cont]=vet2[i];
                cont++;
            }
        }
       
        System.err.println("Numeros nao comuns dos vetores");
        for(int i=0;i<cont;i++)
        {
            System.out.println(vet3[i]);
        }
    }
}
