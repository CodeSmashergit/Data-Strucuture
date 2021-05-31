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
public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Node n=new Node();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insertAt(5,5);
        list.insert(6);
        list.delete(3);
        //list.insertAtStart(0);
        list.show();
    }
    
}
