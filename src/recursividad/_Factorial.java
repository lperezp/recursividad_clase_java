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
public class _Factorial {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factorial function = new Factorial();
        System.out.println("Factorial utilizando un metodo recursivo");
        System.out.println("El factorial de 3 es: " + function.facR(3));
        System.out.println("El factorial de 3 es: " + function.facR(6));
        System.out.println("");
        System.out.println("Factorial utilizando un metodo iterativo");
        System.out.println("El factorial de 3 es: " + function.facl(3));
        System.out.println("El factorial de 3 es: " + function.facl(3));
    }
    
}
