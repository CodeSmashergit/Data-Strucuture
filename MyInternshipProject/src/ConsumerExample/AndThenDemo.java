/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsumerExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author HP
 */
public class AndThenDemo {
      public static void main(String[] args) {
        //Consumer<Integer> display=a->{System.out.println(a);};
        Consumer<List<Integer>>modify=mylist->{
            for(int i=0;i<mylist.size();i++)
            {
                int x=mylist.get(i);
                mylist.set(i, x*2);
            }
        };
        Consumer<List<Integer>> display=mylist->{
            for(Integer c:mylist)
            {
                System.out.println(c);
            }
        };
        
        Consumer<List<Integer>> both=modify.andThen(display);
        
        List<Integer> numList=Arrays.asList(1,2,3,4,5);
        System.out.println("Before Doubling");
        display.accept(numList);
        System.out.println("After doubling");
//        modify.accept(numList);
//        display.accept(numList);
        both.accept(numList);
    }
    
}
