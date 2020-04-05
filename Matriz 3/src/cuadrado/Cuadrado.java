/*
Solorzano Trejo Brandon Uriel
2S11
Ingresar valor de n y m con matriz
 */
package cuadrado;
import java.util.Scanner;
public class Cuadrado {
public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del cuadrado: ");
        int n = teclado.nextInt();
        
        if(n>=0 && n<50){
        for(int i = 0; i< n; i++){
        System.out.print("0");
        }
        System.out.println();
        
            
        for(int i = 0; i< n-2; i++){
        System.out.print("0");
        
        for(int j = 0; j< n-2; j++){
        System.out.print(" ");
        }
        System.out.println("0");
        }
            
        for(int i = 0; i< n; i++){
        System.out.print("0");
            }
        }
    }
}