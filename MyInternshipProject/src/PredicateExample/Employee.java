/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredicateExample;

/**
 *
 * @author HP
 */
public class Employee {

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", projectsDone=" + projectsDone + ", salary=" + salary + '}';
    }

    public Employee(String name, int projectsDone, double salary) {
        this.name = name;
        this.projectsDone = projectsDone;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectsDone() {
        return projectsDone;
    }

    public void setProjectsDone(int projectsDone) {
        this.projectsDone = projectsDone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    String name;
    int projectsDone;
    double salary;
    
}
