/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisisnetbeansproject;

import java.util.ArrayList;

/**
 *
 * @author kosti
 */
public class FuerzaBruta {
    int asignaciones = 0;
    int comparaciones = 0;
 public int sumList( ArrayList<Integer> arr, Integer number){
        Integer result = 0;
        asignaciones+=2;
        for(int i = 0; i < arr.size(); i++){
            asignaciones+=2;
            comparaciones+=1;
            result+=arr.get(i);
        }
        return result + number;
    }

    public ArrayList<Integer> foundZeroAux(ArrayList<Integer> arr, Integer result){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> temp = arr;
        asignaciones+=2;
        while(temp.size() > 1){
            comparaciones++;
            asignaciones+=2;
            numbers.add(temp.get(0));
            for (Integer i = 1; i < temp.size(); i++) {
                asignaciones+=2;
                comparaciones+=2;
                if(sumList(numbers, temp.get(i)) == result) {
                    numbers.add(temp.get(i));
                    return numbers;
                  }
            }
            asignaciones++;
            temp.remove(0);
        }
        ArrayList<Integer> empty = new ArrayList<Integer>();
        return empty;
    }

    public ArrayList<Integer> foundZero(ArrayList<Integer> array, Integer result){
        ArrayList<Integer> temp = array;
        asignaciones++;
        while( temp.size() > 0 ){
            comparaciones+=2;
            asignaciones+=2;
            ArrayList<Integer> numbers = foundZeroAux(temp, result);
            if(numbers.size() > 0){
                System.out.println("TOTAL DE ASIGNACIONES "+ asignaciones);
                System.out.println("TOTAL DE COMPARACIONES "+ comparaciones);
                return numbers;
            }
        
            temp.remove(0);
        }
        System.out.println("TOTAL DE ASIGNACIONES "+ asignaciones);
        System.out.println("TOTAL DE COMPARACIONES "+ comparaciones);
        ArrayList<Integer> empty = new ArrayList<Integer>();
        return empty;

    }
    
    
    
}
