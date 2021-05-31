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
public class HeapSort {
    public static void main(String[] args) {
        int arr[]={13,22,15,11,10,14,12};
        //HeapSort hs=new HeapSort();
        sort(arr);
        printArray(arr);
    }
    public static void sort(int arr[])
    {
        int leng=arr.length;
        for(int i=leng/2-1;i>=0;i--)
        {                                   //assure that first element will be largest
            heapify(arr,leng,i);
        }
        for(int i=leng-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
    }
    public static  void heapify(int arr[],int len,int i)
    {
        int largest=i;
        int ls=2*i+1;
        int rs=2*i+2;
        if(ls<len&&arr[ls]>arr[largest])
        {
            largest=ls;
        }
        if(rs<len&&arr[rs]>arr[largest])
        {
            largest=rs;
        }
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,len,largest);
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
