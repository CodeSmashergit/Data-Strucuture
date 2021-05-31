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
public class PredicateExample3 {
    public static void main(String[] args) {
        Predicate<Integer>p=n->n>0;
        List<Integer>list=Arrays.asList(10,-2,14,-3,-12,4,6,1,-9);
        for(int i:list)
        {
            if(p.test(i))
            {
                System.out.println(i);
            }
        }
    }
    
}
