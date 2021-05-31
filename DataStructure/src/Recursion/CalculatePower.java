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
public class CalculatePower {
    public static void main(String[] args) {
        System.out.println("Answer is:"+pow(3,4));
    }
    public static int pow(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        return a*pow(a,b-1);
    }
}
