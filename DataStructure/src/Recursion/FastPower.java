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
public class FastPower {
    static int stepcount=0;
    public static void main(String[] args) {
        System.out.println("Anser is:"+fastPower(3,5));
        System.out.println("Step:"+stepcount);
    }
    public static int fastPower(int a,int b)
    {
        stepcount++;
        System.out.println(b);
        if(b==0)
        {
            return 1;
        }
        if(b%2==0)
        {
            return fastPower(a*a,b/2);
        }
        return a*fastPower(a,b-1);
    }
}
