/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author HP
 */
public class QuickSort {
    
    public static void main(String[] args) {
        int arr[]={40,30,10,20};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
    public static void quickSort(int []arr,int beg,int end)
    {
        int loc;
        loc=partition(arr,beg,end);
       if(beg<loc-1)
       {
            quickSort(arr,beg,loc-1);
       }
       if(loc<end)
       {
           quickSort(arr,loc,end);
       }
    }
    public static int partition(int []arr,int beg,int end)
    {
        int pivot=arr[(beg+end)/2];
        while(end>=beg)
        {
            while(pivot>arr[beg])
            {
                 beg++;
            }
            while(pivot<arr[end])
            {
                 end--;
            }
            if(beg<=end)
            {
                int temp=arr[beg];
                arr[beg]=arr[end];
                arr[end]=temp;
                beg++;
                end--;
            }
        }       
        return beg;
    }
    public static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
