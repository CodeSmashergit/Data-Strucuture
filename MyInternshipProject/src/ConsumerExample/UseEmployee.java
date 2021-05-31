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
public class UseEmployee {
    public static void main(String[] args) {
         List<Employee>empList=Arrays.asList(new Employee("Sumit",101,50000.0),
                new Employee("Vikas",102,150000.0),
                new Employee("Deepak",103,40000.0),  //using Method refference
                new Employee("Ankit",104,100000.0),
                new Employee("Arjun",105,20000.0),
                new Employee("Rakesh",106,10000.0));
         Consumer<Employee>printer=emp->{
                 System.out.println(emp);
         };
         Consumer<Employee>raiser=emp->{
//             double salary=emp.getSalary()+((emp.getSalary()*10)/100);
//             emp.setSalary(salary);
             emp.setSalary(emp.getSalary()*1.1);
         };
         System.out.println("Before Increasing!!");
         process(empList,printer);
        System.out.println("After Increasing!!");
        process(empList,raiser.andThen(printer)); 
         
    }
    public static void process(List<Employee>empList,Consumer<Employee>task)
    {
        for(Employee emp:empList)
        {
            task.accept(emp);
        }
    }
}
