/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

/**
 *
 * @author ACER
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        try{
        n = System.in.read();
        }
        catch(java.io.IOException m){
        System.out.println(m);
        }
      System.out.println("hasil :  "+(char)n);
    }
}
