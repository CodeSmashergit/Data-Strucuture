/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author HP
 */
public class UseEmployee {
    public static void main(String[] args) {
        List<Employee>empList=Arrays.asList(new Employee("Sumit",4,50000.0),
                new Employee("Vikas",8,150000.0),
                new Employee("Deepak",2,40000.0),
                new Employee("Ankit",6,100000.0),
                new Employee("Arjun",1,20000.0),
                new Employee("Rakesh",0,10000.0));
        Function<Employee,Character>fn=emp->{
            if(emp.getProjectsDone()>5)
                return 'A';
            else if(emp.getProjectsDone()>=3&&emp.getProjectsDone()<=5)
                return 'B';
            else if(emp.getProjectsDone()>=1&&emp.getProjectsDone()<=2)
                return 'C';
            else
                return 'D';
        };
        
       process(empList,fn);
    }
    public static void process(List<Employee>empList,Function<Employee,Character> fn)
    { 
        for(Employee emp:empList)
        {
            if(fn.apply(emp)=='A'||fn.apply(emp)=='B')
            {
                System.out.println("Name is:"+emp.getName()+", ProjectDone:"+emp.getProjectsDone()+", Grade is:"+fn.apply(emp)+", Salary is:"+emp.getSalary()+", New Salary is:"+(emp.getSalary()+(emp.getSalary()*10)/100.0));
            }
            else
            {
                 System.out.println("Name is:"+emp.getName()+", ProjectDone:"+emp.getProjectsDone()+", Grade is:"+fn.apply(emp)+", Salary is:"+emp.getSalary());
            }
        }
    }
}
