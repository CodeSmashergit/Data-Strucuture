/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LamdaExample;

/**
 *
 * @author HP
 */
public class UseReverseString1 {
    public static void main(String[] args) {
        ReverseString1 rs=(s)->{
            String fs="";
            for(int i=s.length()-1;i>=0;i--)
            {   
                fs=fs+s.charAt(i);
            }
            return fs;
        
        };
        System.out.println("Reverse String is:"+rs.reverse("Bhopal"));
        }
    }
    

