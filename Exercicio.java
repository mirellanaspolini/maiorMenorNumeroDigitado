import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int maiorNum=0, menorNum=0, num=0, contador=0;
        Scanner leitor = new Scanner(System.in);

        do{
            System.out.println("Digite um número:");
            num = Integer.parseInt(leitor.nextLine());
            if (num >= 0){
                if (maiorNum < num){
                    maiorNum = num;
                if (contador == 0){
                    menorNum = num;    
                }else if (menorNum > num){
                        menorNum = num;
                    }
                }                
            }
            contador++;
        }while(num > 0);
        System.out.println("Maior número: "+maiorNum);
        System.out.println("Menor número: "+menorNum);

        leitor.close();        
    }
}

