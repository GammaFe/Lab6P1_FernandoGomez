
package com.mycompany.lab6p1_fernandogomez;
import java.util.Scanner;
        import java.util.Random;
public class Lab6P1_FernandoGomez {

    public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in);
         while (true){
        System.out.println("Ingrese una opcion"); 
        System.out.println("opcion 1");
        System.out.println("opcion 2");
        System.out.println("opcion 3");
        System.out.println("Salida 4");
        System.out.println("********************** ");
        int zwitch= entrada.nextInt();        
        switch (zwitch){
        ///ejercio 3
            case 3:
        System.out.println("Ingrese la cantidad de filas que desea en la matriz");
        int X = entrada.nextInt();
        System.out.println("Ingrese la cantidad de columans que desea");
        int Y =entrada.nextInt();
        System.out.println("Matriz"+X+"*"+Y);
                ejercicio3(X,Y);
            break;
            case 2:
                System.out.println("Ingrese 1 para tijeras,2 papel, 3 piedra, 4 lagartija 5 spoc");
                int decicion = entrada.nextInt();
                int   numero = new Random().nextInt((5-1)+1)+1;
                ejercicio2( decicion,numero);
                   
            break;
            case 1:
                int acum = 0;
                int cont = 0;
                while(cont < 8){
                System.out.println("desea tirar el dado y/n");
                String resp = entrada.nextLine();
                int dado = new Random().nextInt((6-1)+1)+1;
                      acum = acum + dado;
                if (acum> 8){
                    cont = cont +1;
                    acum = 0;
                }
                ejercicio1(cont,acum);
                                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("ingrese un numero valido");
                break;
        }
        }
    }
    //fuera del main sitio para metodos
    public static void ejercicio3(int X,int Y){
         Scanner entrada = new Scanner (System.in);
                      int[][] matriz= new int[X][Y]; 
              for (int i = 0; i < matriz.length; i++) {
                   for (int j = 0; j < matriz[i].length; j++) {                
              int   numero = new Random().nextInt((122-97)+1)+97;
             char letra = (char) numero ;

                        System.out.print(numero+"-");     
                    }
                   System.out.println("");                   
    }
              System.out.println("");
              System.out.println("");
               for (int i = 0; i < matriz.length; i++) {
                   for (int j = 0; j < matriz[i].length; j++) {                
              int   numero = new Random().nextInt((122-97)+1)+97;
             char letra = (char) numero ;

                        System.out.print(letra+"-");     
                    }
                   System.out.println("");

                
                }
    
}
    public static void ejercicio2(int decicion, int numero){
           Scanner entrada = new Scanner (System.in);
           int [][] matrix = new int[5][5];
             for (int i = 0; i < matrix.length; i++) {
                   for (int j = 0; j < matrix[i].length; j++) {                
if ( i == j){
    matrix[i][j] =0;
    System.out.println("empate");          
            }
   
}
                   }
             }
    public static void ejercicio1(int cont, int acum) {
        int [][] matriz = new int[cont][acum];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if((i==cont)&&(j==acum)){
                    System.out.print("P");
            }else{
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    } 
    }

    
    
    

