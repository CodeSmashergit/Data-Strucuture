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
public class DSStack {
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    public void push(int data)
    {
        if(capacity==size())
        {
            expand();
        }
            stack[top]=data;
            top++;
    }
    public int size()
    {
        return top;
    }
    public void show()
    {
        for(int i=0;i<size();i++)
        {
            System.out.println(stack[i]);
        }
    }
    public boolean isEmpty()
    {
        return top<=0;
    }
    public int pop()
    {
        int data=0;
        if(isEmpty())
        {
            System.out.println("Stack is empty!!");
        }
        else
        {
            top--;
            data=stack[top];
            stack[top]=0;  
            shrink();
        }
        return data;
    }
    public int peek()
    {
        int data;
        data=stack[top-1];
        return data;
    }

    private void expand() {
        int length=size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
        capacity*=2;
    }
    private void shrink()
    {
        int length=size();
        if(length<=(capacity/2)/2)
        {
            capacity/=2;
        }
        int newStack[]=new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
        capacity*=2;
    }
}
