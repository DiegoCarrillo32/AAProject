package com.mycompany.analisisnetbeansproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Dinamica {
    int comparaciones = 0;
    int asignaciones = 0;
    int comando = 0;
    int sumaMasCercana = -100;
    List<Integer> arregloMasCercano;
    public void findSets(int [] arrA){

        System.out.println("Given Array: " + Arrays.toString(arrA) + ", required sum: " + 0);
        Arrays.sort(arrA);
        List<Integer> combinationList = new ArrayList<>();
        combinationUtil(arrA, 0, 0, combinationList);
        System.out.println("TOTAL DE ASIGNACIONES "+ asignaciones);
        System.out.println("TOTAL DE COMPARACIONES "+ comparaciones);
    }

    public void combinationUtil(int arrA[], int currSum, int start, List<Integer> combinationList) {
        
        //si la diferencia de 0 hasta la suma es menor a la suma guardada
            //la suma guardada va a ser igual a la nueva diferencia
        
        if (currSum == 0 && combinationList.size() > 0) {
            comando++;
            System.out.println("Arreglo encontrado "+combinationList);
            
            return;
        }
        
        comparaciones+=2;
        asignaciones+=1;
        for (int i = start; i < arrA.length; i++) {
            comparaciones+=2;
            asignaciones+=3;
            if (currSum + arrA[i] > 0) {
                //sacar la diferencia desde 0 menos el numero mas cercano
                int diferencia = 0 - sumaMasCercana;
                //se compara si la nueva suma es menor que la diferencia, si es asi este valor esta más cerca de 0
                if((currSum + arrA[i]) < diferencia){
                    sumaMasCercana = currSum + arrA[i];
                }
                System.out.println("Arreglo mas cercano encontrado fue "+arregloMasCercano);
                break;
            }
            
            combinationList.add(arrA[i]);
            combinationUtil(arrA, currSum + arrA[i], i + 1, combinationList);
            if(comando == 1){
                break;
            }
            combinationList.remove(combinationList.size() - 1);
        }
        arregloMasCercano = combinationList;
        
    }
    
}


