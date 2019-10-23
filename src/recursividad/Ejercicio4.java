/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author LAB-USR-LN6377-B0303
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    
    public static void mostrarArray(int[] array,int indice){
        if(indice == (array.length-1)){
            System.out.println(array[indice]);
        }else{ 
            System.out.println(array[indice]);
            mostrarArray(array,indice+1);
        }
    }
    
    public static void main(String[] args) {
       int[] array = {1,2,3,4,5};
       mostrarArray(array,0);
    }
    
}
