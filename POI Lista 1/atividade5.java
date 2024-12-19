package Lista1;
import java.util.Scanner;
/*5. Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre */
public class atividade5 {
    public static void main(String[] args){
        int idade;
        double peso;
        double altu;
        int numTimes=2;
        int jogTime=2;
        int somaIdade=0;
        double somaAlt=0;
        int inferior=0;
        int mais80=0;
        double porc80=0;
        double mediaIdades=0;
        double mediaAlt;

        Scanner times= new Scanner(System.in);

        for(int i=0;i<numTimes;i++)
        {
            System.out.println("Time "+(i+1)+":");

            for(int j=0;j<jogTime;j++){
                System.out.println("Digite a idade do jogador "+(j+1)+":");
                idade=times.nextInt();
                System.out.println("Digite o peso do jogador "+(j+1)+":");
                peso=times.nextDouble();
                System.out.println("Digite a altura do jogador "+(j+1)+":");
                altu=times.nextDouble();

                if(idade<18)
                {
                    inferior++;
                }
                if (peso>80)
                {
                    mais80++;
                }

                somaIdade+=idade;
                somaAlt+=altu;
            }
            mediaIdades=somaIdade/jogTime;
            System.out.println("Média das idades do time " +(i+1)+ ": " + mediaIdades);
            somaIdade=0;
        }
        int totalJog=numTimes*jogTime;
        mediaAlt=somaAlt/totalJog;
        
        porc80=(mais80/totalJog)*100;

        System.out.println("Quantidade de jogadores com idade inferior a 18: "+inferior);
        System.out.println("A media de altura de todos os jogadores e: "+mediaAlt);
        System.out.println("A porcentagem de jogadores com mais de 80kg e: "+mais80);
    }
}
