/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodReffExample;

import java.util.function.Supplier;

/**
 *
 * @author HP
 */
 class Company{

    public String getCompName() {
        return compName;
    }

    public Company(String compName) {
        this.compName = compName;
    }
    String compName;
}
public class Methodref2 {
    public static void main(String[] args) {
        Company mycompany=new Company("Google");
        Supplier<String> s=mycompany::getCompName;
        System.out.println("Company name is:"+s.get());
        
    }
    
}
