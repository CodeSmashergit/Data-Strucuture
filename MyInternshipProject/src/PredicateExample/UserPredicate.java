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
public class UserPredicate {
    public static void main(String[] args) {
     List<User> users = Arrays.asList(new User("Deepak", "admin"),
					new User("Akanksha", "employee"),
					new User("Raunak","member"),
					new User("Amit", "admin"),
					new User("Ravi", "employee"),
					new User("Ajit","employee"));
     User t=new User("Amit","admin");
     Predicate<User>p=Predicate.isEqual(t);
     System.out.println("User Amit Found:"+process(users,p));  

    }
    public static boolean process(List<User> users,  
                            Predicate<User> p)
    {
        for (User user: users)         
            if (p.test(user))             
                return true; 
        return false; 
    }
}
