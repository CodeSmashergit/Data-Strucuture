/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredicateExample;

import java.util.function.Predicate;

/**
 *
 * @author HP
 */
public class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<String>p=(String str)->{ return new StringBuffer(str).reverse().toString().equals(str);};
        System.out.println("Reverse of:"+p.test("NITIN"));
        System.out.println("Reverse of:"+p.test("SHUBHAM"));
    }
    
}
