package Lista1;
import java.util.Scanner;
/*3. Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles */
public class atividade3 {
    public static void main(String[] args) {
        float l1;
        float l2;
        float l3;
        float a1;
        float a2;
        float a3;

        Scanner atividade3=new Scanner(System.in);

        System.out.println("Digite o primeiro angulo do triangulo: ");
        a1=atividade3.nextFloat();
        System.out.println("Digite o segundo angulo do triangulo: ");
        a2=atividade3.nextFloat();
        System.out.println("Digite o terceiro angulo do triangulo: ");
        a3=atividade3.nextFloat();
        
        System.out.println("Digite o primeiro lado do triangulo: ");
        l1=atividade3.nextFloat();
        System.out.println("Digite o segundo lado do triangulo: ");
        l2=atividade3.nextFloat();
        System.out.println("Digite o terceiro lado do triangulo: ");
        l3=atividade3.nextFloat();

        if(a1==90 || a2==90 || a3==90){
            System.out.println("O triangulo e retangulo");
        }else if (a1<90 && a2<90 && a3<90){
            System.out.println("O triangulo e acutangulo");
        }else {
            System.out.println("O triangulo e obtusangulo");
        }
        
        if (l1==l2 && l2==l3){
            System.out.println("O triangulo e equilatero");
        }else if (l1==l2 || l2==l3 || l3==l1){
            System.out.println("O triangulo e isosceles ");
        }else{
            System.out.println("O triangulo e escaleno");
        }
    }
}

