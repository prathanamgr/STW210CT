/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushpop;

/**
 *
 * @author DELL
 */
public class Pushpop {
StackNode root;
static class StackNode{
    int data;
         StackNode next;
    StackNode(int data)
    {
        this.data= data;
    }
    }
public boolean isEmpty()
{
    if (root== null){
        return true;
    }
    else
        return false;
}
public void push (int data)
{
    StackNode newNode = new StackNode(data);
    if (root== null){
        root= newNode;
    }
    else
    {
        StackNode temp = root;
        newNode.next = temp;
    }
    System.out.println(data +"pushed to stack");
    
    }
public int pop()
{
    int popped= Integer.MIN_VALUE;
    if(root== null){
        System.out.println("Stack is Empty");
    }
    else{
        popped= root.data;
        root= root.next;
    }
    return popped;
}

           
    
        

 

    public static void main(String[] args)
{
        Pushpop s11= new Pushpop();
s11.push(40);
s11.push(50);
s11.push(60);
System.out.println(s11.pop()+"popped from stack");

    }
    
}
