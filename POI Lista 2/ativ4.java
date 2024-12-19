/*4. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:*/

import java.util.Scanner;
public class ativ4 {
    public static void main(String[] args) {
        int cod[] = new int[10];
        float saldo[] = new float[10];
        int codDep;
        float depo;
        int codSa;
        float saque;
        float ativo=0;

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<10;i++){
            System.out.print("Digite o codigo da conta: ");
            cod[i]=sc.nextInt();

            for(int j=0;j<i;j++){
                if(cod[i]==cod[j]){
                    System.out.println("Codigo ja existe, insira outro valor: ");
                    i--;
                    break;
                }
            }
            System.out.print("Digite o saldo da conta: ");
            saldo[i]=sc.nextFloat();

            ativo+=saldo[i];
        }
        int opc;
        for(;;){
            System.out.println("Escolha uma opcao: ");
            System.out.println("1- Efetuar deposito: ");
            System.out.println("2- Efetuar saque ");
            System.out.println("3- Consultar o ativo Bancario ");
            System.out.println("4- finalizar ");
            opc=sc.nextInt();

            if(opc==4)
            {
                break;
            }else if(opc==1)
            {
                System.out.print("Digite o codigo da conta para efetuar deposito: ");
                codDep=sc.nextInt();
                System.out.print("Digite o valor do deposito: ");
                depo=sc.nextFloat();

                for(int i=0;i<10;i++){
                    if (codDep==cod[i])
                    {
                        saldo[i]+=depo;
                        ativo+=depo;
                    }
                }
            }else if (opc==2){
                System.out.print("Digite o codigo da conta para efetuar saque: ");
                codSa=sc.nextInt();
                System.out.print("Digite o valor do saque: ");
                saque=sc.nextFloat();
                for(int i=0;i<10;i++)
                {
                    if(codSa==cod[i])
                    {
                        if (saldo[i]>=saque)
                        {
                            saldo[i]-=saque;
                            ativo-=saque;
                        }else{
                            System.out.print("Saldo Insuficiente");
                        }
                    }
                }
            }else if(opc==3)
            {
                System.out.println("O ativo bancário e: "+ativo);
            }
    }   
}
}