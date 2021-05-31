/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS;

import java.util.PriorityQueue;

/**
 *
 * @author HP
 */
public class PQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(15);
        System.out.println("Polled element is:"+pq.poll());
        System.out.println("Polled element is:"+pq.poll());
    }
}
