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
public class LinkedList {
    Node head=null;//by default it is null
    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;//optional
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtStart(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    public void insertAt(int data,int index)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        if(index==0)
        {
            insertAtStart(data);
        }
        else
        {
            for(int i=0;i<index-2;i++)
            {
                n=n.next; 
            }
            node.next=n.next;
            n.next=node;
        }
    }
    public void delete(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-2;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("Deletd Element:"+n1.data);
        }
    }
    
    
    
}
