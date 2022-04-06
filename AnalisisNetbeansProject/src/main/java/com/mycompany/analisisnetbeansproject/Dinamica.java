package com.mycompany.analisisnetbeansproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// A recursive solution for subset sum
// problem

/* This code is contributed by Rajat Mishra */
// Java implementation of above approach




public class Dinamica {
    int comparaciones = 0;
    int asignaciones = 0;
    int comando = 0;
    public void findSets(int [] arrA){

        System.out.println("Given Array: " + Arrays.toString(arrA) + ", required sum: " + 0);
        Arrays.sort(arrA);
        List<Integer> combinationList = new ArrayList<>();
        combinationUtil(arrA, 0, 0, combinationList);
        System.out.println("TOTAL DE ASIGNACIONES "+ asignaciones);
        System.out.println("TOTAL DE COMPARACIONES "+ comparaciones);
    }

    public void combinationUtil(int arrA[], int currSum, int start, List<Integer> combinationList) {

        if (currSum == 0 && combinationList.size() > 0) {
            comando++;
            System.out.println(combinationList);
            return;
        }
        comparaciones+=2;
        asignaciones+=1;
        for (int i = start; i < arrA.length; i++) {
            comparaciones+=2;
            asignaciones+=3;
            if (currSum + arrA[i] > 0) //array is sorted, no need to check further
                break;
            combinationList.add(arrA[i]);
            combinationUtil(arrA, currSum + arrA[i], i + 1, combinationList);
            if(comando == 1){
                break;
            }
            combinationList.remove(combinationList.size() - 1);
        }
    }
    
}


