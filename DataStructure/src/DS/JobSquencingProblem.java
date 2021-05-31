/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JobSquencingProblem {
  public static void main(String args[] ) throws Exception {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        while(m--!=0)
        {
            int s=kb.nextInt();
            int d=kb.nextInt();
            int difference=d-s;
            if(difference<=2)
            {
                list.add(String.valueOf(d));
            }
            else
            {
                if(list.contains(String.valueOf(s)))
                {
                    System.out.println("");
                    System.out.print(s+"    "+d);
                    list.remove(String.valueOf(s));
                    list.remove(String.valueOf(d));
                }
            }
        }
        System.out.println(list.size());
        for(String obj: list)
        {
            System.out.print(obj+" ");
        }

    }
}
