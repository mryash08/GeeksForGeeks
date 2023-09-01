//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}
// } Driver Code Ends




/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    
	    Node t = new Node(Integer.MAX_VALUE);
	    Node temp = head1;
	    while(temp != null) {
	        insert(t, temp.data);
	        temp = temp.next;
	    }
	    
	    Node temp1 = head2;
	    while(temp1 != null) {
	        insert(t,temp1.data);
	        temp1 = temp1.next;
	    }
	    return t.next;
	}
	
	public static void insert(Node head, int val) {
	    Node nn = new Node(val);
	    if(head == null || val < head.data) {
	        nn.next = head;
	    } 
	    
	    Node curr = head;
	    
	    while(curr.next != null) {
	        if(curr.next.data == val)
	            return;
	        if(curr.next.data < val)
	            curr = curr.next;
	        else 
	            break;
	    }
	    
	    nn.next = curr.next;
	    curr.next = nn;
	}
}
