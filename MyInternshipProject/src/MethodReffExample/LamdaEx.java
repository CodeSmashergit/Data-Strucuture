/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodReffExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author HP
 */
public class LamdaEx {
    public static void main(String[] args) {
        
        Supplier<List<String>> s=ArrayList::new;
        
        List<String> myList=s.get();
        System.out.println(myList);
    }
}
