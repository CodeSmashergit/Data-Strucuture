/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodReffExample;

import java.util.function.Function;

/**
 *
 * @author HP
 */
public class MRDeom1 {
    public static void main(String[] args) {
        Function<String,Integer>f1=Integer::parseInt;
        int c=f1.apply(args[0])+f1.apply(args[1]);
        System.out.println("The sum of "+args[0]+" And "+args[1]+" is "+c);
        
    }
    
}
