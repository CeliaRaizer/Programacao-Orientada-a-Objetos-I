package Lista1;
import java.util.Scanner;

/*7. Faça um programa que leia dois números e apresente o fatorial de todos os números
que estejam dentro do intervalo definido pelos números que foram lidos */
public class atividade7 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int fatorial=1;
        int inicio=0;
        int fim=0;

        Scanner fator = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        num1=fator.nextInt();
        System.out.println("Digite o segundo numero");
        num2=fator.nextInt();

        if(num1<num2)
        {
            inicio=num1;
            fim=num2;
        }else{
            inicio=num2;
            fim=num1;
        }
        
        for(int i=inicio;i<=fim;i++){
            fatorial=1;
            for(int j=1;j<=i;j++){
                fatorial*= j;
            }
            System.out.println("O fatorial de "+i+" e "+fatorial);
        }
    }
} 
