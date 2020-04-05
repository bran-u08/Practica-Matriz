/*
Solorzano Trejo Brandon Uriel
2S11
Diagonal
 */
package matriz.pkg2;

import java.util.Scanner;

public class Matriz2 {


    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
    boolean numeroCorrecto = false;
    int n,m;
        System.out.print("Ingrese la cantidad de filas (numero impar): ");
      int  a = teclado.nextInt();
            
    char [][] matriz = new char [a][a];
 
    
    for (int i=0; i< matriz.length; i++){
    for (int j=0; j< matriz.length; j++){
       
      int x = i + 1;
        if((i == j) || (j == (a-a))){
            matriz [i][j] = ' ';
            System.out.print(matriz[i][j]+" ");
        }else{
            matriz[i][j]= 'x';
            System.out.print(matriz[i][j]+" ");
        }
    }
    System.out.println();
       }
    }
}

    
    

