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
public class predicateExample {
    public static void main(String[] args) {
        Predicate<Integer> p=n->n%2==0;
        System.out.println(p.test(8));
        System.out.println(p.test(9));
    }
    
}
