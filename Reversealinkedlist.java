import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		  LinkedListNode<Integer> temp = null;
        while(head!=null){
            LinkedListNode<Integer> node = new LinkedListNode<Integer>(head.data);
            node.next = temp;
            temp = node;
            head = head.next;
        }
        return temp;
    }
}
