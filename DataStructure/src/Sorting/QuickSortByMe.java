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
public class QuickSortByMe {
    public static void main(String[] args) {
        int arr[]={20,40,60,80,10,30,50,70,90};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
    public static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int beg,int end){
        int loc=partition(arr,beg,end);
        if(loc-1>beg)
        {
            quickSort(arr,beg,loc-1);
        }
        if(loc<end)
        {
            quickSort(arr,loc,end);
        }
        
    }
    public static int partition(int arr[],int beg,int end)
    {
        int pivot=arr[(beg+end)/2];
        while(beg<=end)
        {
            while(arr[beg]<pivot)
            {
                beg++;
            }
            while(arr[end]>pivot)
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
    
}
