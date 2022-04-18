/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.analisisnetbeansproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
/**
 *
 * @author kosti
 */
public class AnalisisNetbeansProject {
    
    public static ArrayList<Integer> toArrayList(int[] arr) {
      ArrayList<Integer> array = new ArrayList();
      for(int i = 0; i < arr.length; i++){
          array.add(arr[i]);
      }
      return array;
    };
        
        static int[] rdm(int num) {
          Random rd = new Random(); // creating Random object
          int[] arr = new int[num];
          for (int i = 0; i < arr.length; i++) {
             arr[i] = rd.nextInt(100 +100)-100; // storing random integers in an array
          }
            return arr;
        }
    public static void main(String[] args) {
        
        
        //Dinamica dinamica = new Dinamica();
        //FuerzaBruta fuerza = new FuerzaBruta();
        
        //burned data
        int [] arrQ3 =  {3,14,1};
        int [] arrQ4 =  {3,14,1,8};
        int [] arrQ5 =  {3,14,1,8,19};
        int [] arrQ6 =  {3,14,1,8,19,-1};
        int [] arrQ7 =  {3,14,1,8,19,-1,3};
        int [] arrQ8 =  {3,14,1,8,19,-1,3,8};
        int [] arrQ9 =  {3,14,1,8,19,-1,3,8, 13};
        int [] arrQ10 = {3,14,1,8,19,-1,3,8, 13,9};
        int [] arrQ11 = {3,14,1,8,19,-1,3,8, 13,9, 12};
        int [] arrQ12 = {3,14,1,8,19,-1,3,8, 13,9, 12,15};
        int [] arrQ13 = {3,14,1,8,19,-1,3,8, 13,9, 12,15,10};
        int [] arrQ14 = {3,14,1,8,19,-1,3,8, 13,9, 12,15,10, -8};
        int [] arrQ15 = {3,14,1,8,19,-1,3,8, 13,9, 12,15,10, -8, 10};
        int [] arrQ20 = {3,14,1,8,19,-1,3,8, 13,9, 12,15,10, -8, 10, 11, 12, 16,17,20};
        int [] arrQ30 = {3,14,1,8,19,-1,3,8, 13,9, 12,15,10, -8, 10, 11, 12, 16,17,20,1,2,3,4,5,6,7,8,9,10};
        
        

       
     
        long start = System.currentTimeMillis();
        //dinamica.findSets(arrQ9);
        //fuerza.foundZero(toArrayList(arrQ3), 0);
        long end = System.currentTimeMillis();
        System.out.println("Total miliseconds "+(end-start));
        
        
        
        
    }
}
