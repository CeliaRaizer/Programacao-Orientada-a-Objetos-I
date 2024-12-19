/*3. Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
calcule e mostre 2 vetores resultantes:
• no primeiro vetor resultante, cada elemento será composto pela soma de cada
número par do primeiro vetor somado a todos os números do segundo vetor;
• o segundo vetor resultante será composto pela quantidade de divisores que cada
número ímpar do primeiro vetor tem no segundo vetor */

import java.util.Scanner;

public class ativ3 {
    public static void main(String[] args) {
        int vet1[] = new int[10];
        int vet2[] = new int[5];
        int resul1[] = new int[10];
        int resul2[] = new int[10];
        int cont1=0;
        int cont2=0;

        Scanner num = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.print("Digite o "+(i+1)+" valor do 1 vetor: ");
            vet1[i] = num.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.print("Digite o "+(i+1)+" valor do 5 vetor: ");
            vet2[i] = num.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            if (vet1[i]%2==0)
            {
                int soma = vet1[i];
               for(int j=0; j<5;j++){
                soma+=vet2[j];
               }
               resul1[cont1] = soma;
               cont1++;
            }else{
                int divisor=0;
                for(int j=0;j<5;j++){
                   if(vet1[i]%vet2[j]==0){
                    divisor++;
                   } 
                }
                resul2[cont2]=divisor;
                cont2++;
            }
        }
        System.err.println("resultante 1: ");
        for(int i=0;i<cont1;i++)
        {
            System.out.println(resul1[i]);
        }
        System.out.println("Resultante 2: ");
        for(int i=0;i<cont2;i++)
        {
            System.err.println(resul2[i]);
        }
    }
}
