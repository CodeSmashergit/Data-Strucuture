/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicAlgoi;

/**
 *
 * @author HP
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Sum is:"+sum(5));
    }
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int ans=n+sum(n-1);
        return ans;
    }
}
