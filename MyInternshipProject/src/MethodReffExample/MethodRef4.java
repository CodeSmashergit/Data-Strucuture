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
public class MethodRef4 {
    public static void main(String[] args) {
        Function<String,StringBuffer>fn=StringBuffer::new;
        System.out.println(fn.apply("bhopal"));
        
    }
    
}
