/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.analisisnetbeansproject;

import java.util.ArrayList;

/**
 *
 * @author kosti
 */
public class AnalisisNetbeansProject {

    public static void main(String[] args) {
        
        Dinamica dinamica = new Dinamica();
        FuerzaBruta fuerza = new FuerzaBruta();
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(8);
  
        array.add(3);
        array.add(5);
        array.add(1);
        array.add(-4);
        array.add(15);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(-8);
        array.add(-8);
        int [] arrA = {8,3,5,1,-4,15,1,2,3,4,5,6,7,8,9,10,11,12,13,14,-8};
        ArrayList<Integer> fuerzaa = fuerza.foundZero(array, 0);
        System.out.println(fuerzaa);
        dinamica.findSets(arrA);
        
    }
}
