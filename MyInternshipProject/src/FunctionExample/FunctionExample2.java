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
public class FunctionExample2 {
    public static void main(String[] args) {
    Function<Integer,Double> fn=n->Math.sqrt(n);
        System.out.println("Sqrt of 8 is:"+fn.apply(8));
        System.out.println("Sqrt of 9 is:"+fn.apply(9));
    }
}
