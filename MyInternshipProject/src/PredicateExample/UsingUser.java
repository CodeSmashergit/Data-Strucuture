/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredicateExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author HP
 */
public class UsingUser {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Deepak", "admin"),
				     new User("Akanksha", "employee"),
				     new User("Raunak","member"),
		           	     new User("Amit", "admin"),
				     new User("Ravi", "employee"),
				     new User("Ajit","employee"));
//        Predicate<User>p1=emp->emp.getName().startsWith("A");
        Predicate<User>p2=emp->emp.getRole().equals("admin");
        Predicate<User>p3=emp->emp.getRole().equals("employee");
        
        List<User> myList=process(users,p2.negate().and(p3.negate()));
        System.out.println(myList);

    }
    public static List<User> process(List<User> emplist,Predicate<User>q)
    {
        List<User>result=new ArrayList<>();
        for(User obj:emplist)
            if(q.test(obj))
                result.add(obj);
        return result;
    }
    
}

