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
public class FunctionExample3 {
    public static void main(String[] args) {
        Function<String[],String> fn= sa->{
            StringBuffer sb=new StringBuffer();
          for(String s:sa)
          {
              String s1=s.split(" ")[0];
              sb.append(s1+"\n");
          }
          return sb.toString();
        };
        String []actors={"Hritik roshan","Amir khan","Salman khan","Akshay kumar"};
        System.out.println("First name are:");
        System.out.println(fn.apply(actors));
        
    }
    
}
