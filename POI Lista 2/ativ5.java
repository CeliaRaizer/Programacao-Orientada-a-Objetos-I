/*5. Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados.*/

import java.util.Scanner;

public class ativ5 {
    public static void main(String[] args) {
        int mat[][]= new int[7][7];
        int vet1[] = new int[7];
        int vet2[] = new int [7];

        Scanner num = new Scanner(System.in);

        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++){
                System.out.print("Digite o valor da posicao ["+i+"]["+j+"]: ");
                mat[i][j] = num.nextInt();
            }
        }

        for(int i = 0; i < 7; i++) {
            int maior = mat[i][0]; // Inicializa com o primeiro elemento da linha
            for(int j = 1; j < 7; j++) {
                if(mat[i][j] > maior) {
                    maior = mat[i][j];
                }
            }
            vet1[i] = maior;
        }
        
        for(int j = 0; j < 7; j++) {
            int menor = mat[0][j]; // Inicializa com o primeiro elemento da coluna
            for(int i = 1; i < 7; i++) {
                if(mat[i][j] < menor) {
                    menor = mat[i][j];
                }
            }
            vet2[j] = menor;
        }

        System.out.println("Dados da matriz: ");
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<7;j++){
                System.out.print("  "+mat[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Maiores elementos de cada linha: ");
        for(int i=0;i<7;i++){
            System.out.print("  "+vet1[i]);
        }
        
        System.out.println("\nMenores elementos de cada coluna: ");
        for(int i=0;i<7;i++){
            System.out.print("  "+vet2[i]);
        }
    }    
}
