/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionExample;

import java.util.function.Function;

/**
 *
 * @author HP
 */
public class FunctionExample {
    public static void main(String[] args) {
         
//        Function<String,String> fn=(String n)->{String[]str=n.split(" ");
//        return str[0];};
        Function<String,String>fn=str->str.split(" ")[0];
        System.out.println(fn.apply("Sachin Kapoor"));
    
    }
    
}
