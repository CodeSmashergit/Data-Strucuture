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
public class UseQueue {
    public static void main(String[] args) {
        Queue obj=new Queue();
        obj.enqueue(5);
        obj.enqueue(10);
        obj.enqueue(15);
        obj.enqueue(20);
 
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        //obj.dequeue();
        
//        obj.enqueue(25);
//        obj.enqueue(30);
//        obj.enqueue(35);
//        obj.enqueue(40);
        obj.show();
    }
    
}
