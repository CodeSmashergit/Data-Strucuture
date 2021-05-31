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
public class MethodRef5 {
    public static void main(String[] args) {
        //Function<Integer,Integer>s=(n)->new Integer(n);
        Function<Integer,Integer>s=Integer::new;
        System.out.println(s.apply(100));
    }
    
}
