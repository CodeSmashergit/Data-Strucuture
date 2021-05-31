
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        //Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number to be searched:");
        int search=kb.nextInt();
        int result=binarySearch(arr,0,arr.length-1,search);
        if(result==-1)
        {
            System.out.println("Element not found!!");
        }
        else{
            System.out.println("Element present at index of:"+result);
        }
    }
    public static int binarySearch(int[] arr,int first,int last,int key)
    {
        if(last>=first)
        {
            int mid=(first+last)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]<key)
            {
                return binarySearch(arr,mid+1,last,key);
            }
            else
            {
                return binarySearch(arr,first,mid-1,key);
            }
            
        }
        else
        {
            return -1;
        }
    }
    
}
