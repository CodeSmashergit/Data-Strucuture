/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

/**
 *
 * @author HP
 */
public class UseStack {
    public static void main(String[] args) {
        DSStack obj=new DSStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        System.out.println("Size is:"+obj.size());
        //System.out.println("Is Empty:"+obj.isEmpty());
        obj.show();
        System.out.println();
        obj.pop();
        obj.pop();
        obj.show();
        //System.out.println("peek value is:"+obj.peek());
       // System.out.println("Deleted element is:"+obj.pop());
       // obj.show();
        
    }
    
}
