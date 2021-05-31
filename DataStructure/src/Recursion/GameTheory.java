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
public class GameTheory {
    public static void main(String[] args) {
        int arr[]={1,5,7,3,2,4};
        System.out.println("Max coin win:"+coinMax(arr,0,arr.length-1));
    }
    public static int coinMax(int arr[],int l,int r )
    {
        if(l+1==r)
        {
            return Math.max(arr[l], arr[r]);
        }
        return Math.max(arr[l]+Math.min(coinMax(arr,l+2,r), coinMax(arr,l+1,r-1)),
                arr[r]+Math.min(coinMax(arr,l+1,r-1), coinMax(arr,l,r-2)));
    }
}
