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
public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Max contiguous subarray sum is:"+maxSumArray(arr));
        System.out.println("Value of min_value:"+Integer.MIN_VALUE);
    }
    public static int maxSumArray(int arr[])
    {
        int max_so_far=Integer.MIN_VALUE;
        int max_ending=0;
        for(int i=1;i<arr.length;i++)
        {
           max_ending=max_ending+arr[i];
           if(max_ending>max_so_far)
           {
               max_so_far=max_ending;
           }
           if(max_ending<0)
           {
               max_ending=0;
           }
        }
        return max_so_far;
    }
}
