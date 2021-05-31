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
public class UseNumberTest {
    public static void main(String[] args) {
        int a=10;
        int b=9;
        
        NumberTest nt=(int x,int y)->{  if(x>y)
                                return x;
                             else
                                return y;
                          };
        System.out.println("Max number is:"+nt.max(a, b));
        
    
}
}
