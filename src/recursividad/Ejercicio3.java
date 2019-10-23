/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LN6377-B0303
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1,n2;
        
        System.out.println("Introduzca el primer numero");
        n1 = scanner.nextInt();
        System.out.println("Introduzca el primer numero");
        n2 = scanner.nextInt();
        System.out.println("Suma: " + suma(n1,n2)); 
        }
    
        public static int suma(int a,int b){
            if(b==0){
            return a;
            }else if(a==0){
                return b;
            }else{
                return 1 + suma(a,b-1);
            }
        
    }
    
}
