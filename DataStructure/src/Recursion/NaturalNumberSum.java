/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author HP
 */
public class NaturalNumberSum {
    public static void main(String[] args) {
        System.out.println("Sum is:"+sumNum(5));
    }
    public static int sumNum(int n)
    {
        if(n==1)
            return 1;
        return n+sumNum(n-1);
    }
}
