/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.lez02.domenici;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Dado extends Object{
    private byte numeroFacce;
    private Random random;
    
    public Dado () {
        this((byte)6);
    }

    public Dado(byte numeroFacce) {
        this.numeroFacce = numeroFacce;
        random = new Random();
    }
    
    public byte lancio (){
        return (byte) (random.nextInt(numeroFacce)+1);
    }
    
   @Override
   public String toString (){
       return "numeroFacce: " + numeroFacce;
   }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numeroFacce;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dado other = (Dado) obj;
        
        return this.numeroFacce == other.numeroFacce;
    }
           
}
