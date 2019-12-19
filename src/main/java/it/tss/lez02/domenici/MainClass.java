/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.lez02.domenici;

/**
 *
 * @author tss
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean start = true;
        Dado dado = new Dado();

        Dado d1 = new Dado();
        Dado d2 = new Dado();
        System.out.println(d1.getClass());
        System.out.println(d2.getClass());

        if (d2.getClass().getSimpleName().equals("Dado")) {
            System.out.println(((Dado) d2).lancio());

        }

    }

}


