package exercicio1;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Sao quantas instituicoes? ");
        int institucoes = in.nextInt();
        
        if (institucoes < 1){
          System.out.println("nao existe instituicoes para doacao");  
          System.exit(0);
        }
        
        System.out.println("Qual a quantidade dos produtos nao pereciveis? ");
        int produto1 = in.nextInt();
        System.out.println("Qual a quantidade dos produtos pereciveis?  ");
        int produto2 = in.nextInt();
        System.out.println("Qual a quantidade dos produtos de higiene pessoal?  ");
        int produto3 = in.nextInt();
        
        int soma1 = (produto1/institucoes);
        int soma2 = (produto2/institucoes);
        int soma3 = (produto3/institucoes);
        System.out.println(" ");
        if (produto1 % institucoes != 0){
            System.out.println("Os produtos nao pereciveis nao sao divisiveis");
        }
        if (produto2 % institucoes != 0){
            System.out.println("Os produtos pereciveis nao sao divisiveis");
        }
        if (produto3 % institucoes != 0){
            System.out.println("Os produtos de higiene pessoal nao sao divisiveis");
        }
        
        for (int i = 0; i < institucoes; i++) {
            System.out.println(" ");
            System.out.println("Instituicao " + (i + 1) + ":");
            System.out.println("Produtos nao pereciveis: " + soma1);
            System.out.println("Produtos nao pereciveis: " + soma2);
            System.out.println("Produtos nao pereciveis: " + soma3);
            
            
        }    
    }
}

   
