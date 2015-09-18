/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomadivinha;
import static java.lang.Boolean.TRUE;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ezequiel.fsantos
 */
public class RandomAdivinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       // caso queira mudar o range
       int menor = 0;
       int maior = 100;
       int sorteado;
       sorteado = r.nextInt(maior - menor) + menor;
       System.out.println("Sorteado: " + sorteado); 
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Digite um numero");
       int digitado = keyboard.nextInt();
       
       
       
       while(TRUE){
           
           if(digitado < sorteado)
           {
               System.out.println("Digite um numero MAIOR");
               
           }
           else if(digitado > sorteado)
           {
               System.out.println("Digite um numero MENOR");
           }
           else if(digitado == sorteado)
           {
               System.out.println("ACERTOU =D");
               break;
           }
           digitado = keyboard.nextInt();
       }
       
    }
    
}
