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
public class UseDiceRoller {
    public static void main(String[] args) {
        int max=6;
        int min=1;
        int range=max-min+1;
        int ran=(int)(Math.random()*range)+min;
        DiceRoller dr=()->{return ran;};
        System.out.println("Random number is:"+dr.rollDice());
    }
    
}
