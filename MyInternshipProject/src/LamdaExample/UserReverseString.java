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
public class UserReverseString {
    public static void main(String[] args) {
        
        ReverseString rs=(String str)->{return new StringBuffer(str).reverse().toString();};
        System.out.println("Reverse of is:"+rs.reverse("Bhopal"));
    }
}
