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
public class FloodFill {
    public static void main(String[] args) {
        int arr[][]={
            {1,1,1,2,1,1,1},
            {2,2,1,2,2,1,1},
            {0,2,2,2,1,1,1},
            {1,1,0,2,1,2,2},
            {1,1,0,2,1,2,2},
            {1,1,2,2,1,0,0}
        };
        System.out.println("Before flood fill:");
        display(arr);
        floodFill(arr,0,3,3,2);
        System.out.println("After flood fill:");
        display(arr);
    }
    public static void floodFill(int arr[][],int r,int c,int toFill,int prevFill)
    {
        int rows=arr.length;
        int cols=arr[0].length;
        if(r<0||r>=rows||c<0||c>=cols)
        {
            return;
        }
        if(arr[r][c]!=prevFill)
            return;
        arr[r][c]=toFill;
        floodFill(arr,r-1,c,toFill,prevFill);
        floodFill(arr,r+1,c,toFill,prevFill);
        floodFill(arr,r,c-1,toFill,prevFill);
        floodFill(arr,r,c+1,toFill,prevFill);
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
