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
public class Factorial {
    
    int facl(int num){
        int ind,resultado;
        resultado = 1; 
        for(ind=1; ind<= num;ind++){
            resultado*=ind;
        }
        return resultado;
    }
    
    int facR(int num){
        int resultado;
        if(num == 1){
        return 1;
        }
        resultado = facR(num-1)*num;
        return resultado;
    }
    
    
}
