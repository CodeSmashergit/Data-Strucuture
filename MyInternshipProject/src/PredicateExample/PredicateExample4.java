/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author HP
 */
public class PredicateExample4 {
    public static void main(String[] args) {
        List<Integer> mynos=Arrays.asList(24,10,15,18,1,6,12,11);
        Predicate<Integer> p1=n->n%2==0;
        Predicate<Integer> p2=n->n%3==0;
        apply(p1,mynos);
        System.out.println("");
        apply(p2,mynos);
        System.out.println("");
        apply(p1.and(p2),mynos);
    }
    public static void apply(Predicate<Integer>q,List<Integer> nos)
    {
        for(int obj:nos)
        {
            if(q.test(obj))
            {
                System.out.println(obj);
            }
        }
    }
    
}
