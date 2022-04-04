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
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(-7);
        array.add(-3);
        array.add(-5);
        array.add(5);
        array.add(8);
        
        
        ArrayList<Integer> res = dinamica.foundZero(array, 0);
        System.out.println(res);
    }
}
