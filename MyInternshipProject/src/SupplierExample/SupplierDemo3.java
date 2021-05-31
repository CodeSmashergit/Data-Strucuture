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
public class SupplierDemo3 {
    public static void main(String[] args) {
       Supplier<String>s=()->{
           StringBuffer sb=new StringBuffer();
           Random obj=new Random();
           for(int i=0;i<4;i++)
           {
               int x=obj.nextInt(10);
               sb.append(x);
           }
           return sb.toString();
//       int r=obj.nextInt(999);
//       return r+1000; 
    };
        System.out.println("Random number is:"+s.get());
        System.out.println("Random number is:"+s.get());
        System.out.println("Random number is:"+s.get());
        
    }
    
}
