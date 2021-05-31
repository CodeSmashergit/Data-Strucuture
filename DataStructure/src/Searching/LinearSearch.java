/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        Scanner kb=new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter number to be searched:");
        int search=kb.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element found at:"+i);
                break;
            }
        }
    }
    
}
