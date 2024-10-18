package Exercicio2;
import java.util.Scanner;
public class java {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Preço do produto no exterior: ");
        double valor = in.nextDouble();
        if(valor <= 0){
            System.out.println("Valor inválido, tente novamente mais tarde.");
            System.exit(1);
        }
        System.out.println("Escolher o tipo de frete desejado:");
        System.out.println("1 - Frete Demorado (10% do valor do produto, 60 dias)");
        System.out.println("2 - Frete Médio (15% do valor do produto, 30 dias)");
        System.out.println("3 - Frete Rápido (20% do valor do produto, 20 dias)");
        System.out.print("\nDigite o número correspondente ao frete: ");
        int frete = in.nextInt();
        double taxaFrete = 0;
        double importacao = valor * 0.60;
        String tipoFrete = "";

        if(frete == 1){
            tipoFrete = "Voce escolheu o Frete Demorado.";
            taxaFrete = valor * 0.10;    
        }
        else if (frete == 2){
            tipoFrete = "Voce escolheu o Frete Medio.";
            taxaFrete = valor * 0.15;   
        }
        else if (frete == 3){
            tipoFrete = "Voce escolheu o Frete Rapido.";
            taxaFrete = valor * 0.20;   
        }
        else{
            System.out.println("Opção de frete inválida, tente novamente mais tarde. ");
            return;
        }

        double valorFinal = valor + importacao + taxaFrete;
             
        System.out.println("\n" +tipoFrete); 
        System.out.print("\nTaxa de importação: R$ "+ importacao);
        System.out.print("\nValor do frete: R$ "+ taxaFrete);
        System.out.println("\nValor final da importação: R$ "+ valorFinal +"\n"); 
        


        
        
        
    
    
    
    }
}
