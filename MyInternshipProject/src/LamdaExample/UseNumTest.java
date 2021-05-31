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
public class UseNumTest {
    public static void main(String[] args) {
        NumTest nt=(int a)->{return a%2==0;};
        System.out.println("Result is:"+nt.isEven(2));
    }
    
}
