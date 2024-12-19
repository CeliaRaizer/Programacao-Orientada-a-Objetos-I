package Lista1;
import java.util.Scanner;
//8. Faça uma calculadora de troco, baseado nas cédulas da nossa moeda
public class atividade8 {
    public static void main(String[] args) {
      
        Scanner calculadora = new Scanner(System.in);
      
        float valor=28;
        float Pagamento=100;
        float troco = Pagamento-valor;
        int contaCedulas;
        int[] cedulas={100,50,20,10,5,2,1};
       
        System.out.println("Valor do troco: R$ "+troco);
        //for(int i=0;i<cedulas.lenth;i++)
        for(int cedula: cedulas){
            contaCedulas=(int)troco/cedula;
            System.err.println("Tem "+ contaCedulas +" cedula(s) de "+cedula);
            troco = troco%cedula;
       }
    }    
}
