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
public class Queue {
    int queue[]=new int[5];
    int rear; //by default 0
    int front;
    int size;
    public void enqueue(int data)
    {
        if(!isFull())
        {
            queue[rear]=data;
            rear=(rear+1)%5;
            size++;
        }
        else
        {
            System.out.println("Queue is full!!");
        }
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
            //System.out.print(queue[i]+" ");
            System.out.print(queue[(front+i)%5]+" ");
        }
    }
    public int dequeue()
    {
        int data=0;
        if(!isEmpty())
        {
        data=queue[front];
        front=(front+1)%5;
        size--;
        return data;
        }
        else
        {
            System.out.println("Queue is empty!!");
        }
        return data;
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return getSize()==0;
    }
    public boolean isFull()
    {
        return getSize()==5;
    }
    
}
