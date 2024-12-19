import java.util.Scanner;
class ativ1{
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        int i=0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor lido  | Cubo  | Raiz Quadrada");
        do{
            System.out.print("Digite um numero inteiro (0 para encerrar): ");
            numeros[i] = sc.nextInt(); //dessa forma, o ultimo elemento sera o 0
           
            double cubo = Math.pow(numeros[i], 3);
            double Raiz = Math.sqrt(numeros[i]);

            System.out.printf("%-11d| %-10.2f| %13.2f%n",numeros[i],cubo,Raiz);
            
            i++;

            if(i%20==0)
            {
                System.out.println("Valor lido  | Cubo  | Raiz Quadrada");
            }
        } while(numeros[i-1] != 0);
    }
}