package com.mycompany.analisisnetbeansproject;
import java.util.ArrayList;
public class Dinamica {

    public int sumList( ArrayList<Integer> arr, Integer number){
        Integer result = 0;
        for(int i = 0; i < arr.size(); i++){
            result+=arr.get(i);
        }
        
        return result + number;
    }

    public ArrayList<Integer> foundZeroAux(ArrayList<Integer> arr, Integer result){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        ArrayList<Integer> temp = arr;
        while(temp.size() > 1){
            numbers.add(temp.get(0));
            for (Integer i = 1; i < temp.size(); i++) {
                if(sumList(numbers, temp.get(i)) == result) {
                    numbers.add(temp.get(i));
                    return numbers;
                  }
            }
            temp.remove(0);
        }
        ArrayList<Integer> empty = new ArrayList<Integer>();
        return empty;

    }

    public ArrayList<Integer> foundZero(ArrayList<Integer> array, Integer result){
        ArrayList<Integer> temp = array;
        while( temp.size() > 0 ){
            ArrayList<Integer> numbers = foundZeroAux(temp, result);
            if(numbers.size() > 0){
                return numbers;
            }
            temp.remove(0);
        }
        ArrayList<Integer> empty = new ArrayList<Integer>();
        return empty;

    }    
}
