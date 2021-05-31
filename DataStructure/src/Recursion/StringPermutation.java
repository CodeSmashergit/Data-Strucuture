/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author HP
 */
public class StringPermutation {
    static Set<String> set=new HashSet<>();
    public static void main(String[] args) {
        permutations("abc",0,2);
        
    }
    public static void permutations(String str,int l,int r)
    {
        if(l==r)
        {
            if(set.contains(str))
            {
                return;
            }
            set.add(str);
            System.out.println(str);
            return;
        }
        for(int i=l;i<=r;i++)
        {
            str=interChangeChar(str,l,i);
            permutations(str,l+1,r);
            str=interChangeChar(str,l,i);
        }
    }
    public static String interChangeChar(String s,int a,int b)
    {
        char[] array=s.toCharArray();
        char temp=array[a];
        array[a]=array[b];
        array[b]=temp;
        return String.valueOf(array);
    }
}
