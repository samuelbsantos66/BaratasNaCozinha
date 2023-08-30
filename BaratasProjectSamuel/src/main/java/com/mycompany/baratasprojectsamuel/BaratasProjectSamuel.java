/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.baratasprojectsamuel;

public class BaratasProjectSamuel {

    public static void main(String[] args) {
     Cozinha c = new Cozinha();
     System.out.println("Quantidade inicial: "+ c.pop.baratas);
     c.pop.aumentaBaratas();
     System.out.println("Quantidade intermediária: "+c.pop.baratas);
     c.pop.spray();
     System.out.println("Quantidade final: "+ c.pop.baratas);
    }
}
