package exercicio2_agenda08_2aopcao;

import java.util.Scanner;

public class Exercicio2_agenda08_2aopcao {

    public static void main(String[] args) {
        // declaração de variáveis
        int multiplo = 0;
        int valor, resultado;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Tabuada da Giovanna!");        
        System.out.println("Insira o número que gostaria de saber a tabuada (de 6 a 10):");
        valor = leitor.nextInt();
                
        
        switch (valor) { //início switch-case
            case 6:
                do {
                resultado = 6 * multiplo;
                System.out.println("6 x " + multiplo +  " = " + resultado);
                multiplo++;
                } while (multiplo <= 10);
                break;
            
            case 7:
                do {
                resultado = 7 * multiplo;
                System.out.println("7 x " + multiplo +  " = " + resultado);
                multiplo++;
                } while (multiplo <= 10);                
                break;
                
            case 8:
                do {
                resultado = 8 * multiplo;
                System.out.println("8 x " + multiplo +  " = " + resultado);
                multiplo++;
                } while (multiplo <= 10);
                break;
                
            case 9:
                do {
                resultado = 9 * multiplo;
                System.out.println("9 x " + multiplo +  " = " + resultado);
                multiplo++;
                } while (multiplo <= 10);
                break;
                
            case 10:
                do {
                resultado = 10 * multiplo;
                System.out.println("10 x " + multiplo +  " = " + resultado);
                multiplo++;
                } while (multiplo <= 10);                
                break;
                
            default:
                System.out.println("Insira um número de 6 a 10.");
                break;
        } //fim do switch-case
        
        
        
        
        
        
    }
    
}
