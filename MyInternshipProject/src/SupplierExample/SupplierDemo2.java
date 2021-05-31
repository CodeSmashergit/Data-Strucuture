/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupplierExample;

import java.util.function.Supplier;

/**
 *
 * @author HP
 */
public class SupplierDemo2 {
    public static void main(String[] args) {
//        String str=System.getProperty("java.version");
//        System.out.println(str);
        Supplier<String>s=()->System.getProperty("java.version");
        System.out.println("Current version of java:"+s.get());
    }
    
}
