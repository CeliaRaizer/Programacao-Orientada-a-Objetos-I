package Lista1;
import java.util.Scanner;
/*4. Faça um programa que receba
• O código do produto comprado;
• A quantidade comprada do produto */
public class atividade4 {
    public static void main(String[] args) {
        int cod;
        int quant;
        double preco=0;
        double valorNota=0;
        double desc=0;
        double valorTot=0;

        Scanner produto= new Scanner(System.in);
        
        System.out.println("Digite o codigo do produto: (1-40)");
        cod=produto.nextInt();
        System.out.println("Digite a quantidade comprada: ");
        quant=produto.nextInt();

        if (cod>=1 && cod<=10){
           preco=10;
        }else if(cod>=10 && cod<=20)
        {
            preco=15;
        }else if(cod>=21 && cod<=30)
        {
            preco=20;
        }else if (cod>=31 && cod<=40){
            preco=30;
        }
        valorNota=(preco*quant);

        if(valorNota>200)
        {
            desc=valorNota*0.05;
        }else if(valorNota>=500){
            desc=valorNota*0.10;
        }else if(valorNota>500){
            desc=valorNota*0.15;
        }
        valorTot=valorNota-desc;
        System.out.println("O valor unitario do produto e: "+preco);
        System.out.println("O valor total da nota e: "+valorNota);
        System.out.println("O valor do desconto e: R$"+desc);
        System.out.println("O preco final da nota e: "+valorTot);
    }
}
