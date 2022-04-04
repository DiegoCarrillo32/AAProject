/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisnetbeansproject;

/**
 *
 * @author kosti
 */
public class FuerzaBruta {
    
    public int sumList(int[] arr){
        
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result+=arr[i];
        }
        
        return result;
    }
    
    public void BruteForceAlgorithm(int[] arr){
        
    
        for(int i = 0; i < arr.length; i++){
            
            for(int x = 0; x < arr.length; x++){
               
                //si los index son diferentes entonces se hace el calculo, si no se salta la iteracion            
                if(i != x){
                    //busca un numreo que al sumarlo el resultado es 0
                    if(arr[i] + arr[x] == 0){
                        System.out.println("Se encontró un 0");
                    }
                }
                
                
            }
        }
        
        
    }
    
    
}
