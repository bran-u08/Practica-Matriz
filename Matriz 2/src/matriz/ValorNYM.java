/*
Solorzano Trejo Brandon Uriel
2S11
cruz
 */
package matriz;

import java.util.Scanner;

public class ValorNYM {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    boolean numeroCorrecto = false;
    int n,m;
    
    do {
        
        System.out.print("Ingrese la cantidad de filas (numero impar):");
        n = teclado.nextInt();
        
        System.out.print("Ingrese la cantidad de columnas (numero impar):");
        m = teclado.nextInt();
        
        if(n%2 !=0 && m%2 !=0){
            numeroCorrecto = true;
        }else{
            System.out.println("Datos incorrectos. Ingrese dos valores impares");
        }
        System.out.println();
            
        }while(!numeroCorrecto);
    
    char matriz[][] = new char [n][m];
    
    int mitadFilas = matriz.length/2;
    int mitadColumnas = matriz[0].length/2;
   
    for (int i=0; i< matriz.length; i++){
    for (int j=0; j< matriz[0].length; j++){
       
        if(i == mitadFilas || j == mitadColumnas){
            matriz [i][j] = 'x';
        }else{
            matriz[i][j]= ' ';
        }
        System.out.print(matriz[i][j]+" ");
        }
    System.out.println();
       
    }
  }
}
