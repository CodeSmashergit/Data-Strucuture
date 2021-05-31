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
public class UserMap {
    public static void main(String[] args) {
        StringToIntMapper s=str->str.length();
        //System.out.println("Length of "+args[0]+"is:"+s.map(args[0]));
        System.out.println("Lenght is:"+s.map("Bhopal"));
    }
    
}
