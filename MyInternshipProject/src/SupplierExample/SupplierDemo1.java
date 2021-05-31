/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SupplierExample;

import java.util.Random;
import java.util.function.Supplier;

/**
 *
 * @author HP
 */
public class SupplierDemo1 {
    public static void main(String[] args) {
//        Supplier<Integer>s=()->{
//            Random obj=new Random();
//            int n=obj.nextInt(100);
//            return n;
//        };
        Supplier<Integer> s=()->new Random().nextInt(100);
        System.out.println("First Random is:"+s.get());
        System.out.println("Second Random is:"+s.get());
        System.out.println("Third Random is:"+s.get());
    }
    
}
