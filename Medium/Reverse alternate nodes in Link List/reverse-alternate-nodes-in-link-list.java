//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        Node tail = odd;
        int count = 1;
        while(tail.next != null){
            tail = tail.next;
            count++;
        }
        if(count <= 2) return;
        Node p1=odd;
        Node p2=odd.next;
        Node p3=tail;
        
        while(p1 != tail && p1.next != tail ){
            p2 = p1.next;
            p1.next = p2.next;
            p3.next = p2;
            p1 = p1.next;
            p3 = p3.next;
        }
        p3.next = null;
        Node temp1;
        Node temp2;
        Node temp3;
        if(p1.next == tail){
            temp1 = p1.next.next;
            temp2 = temp1.next;
            tail = p1.next;
        }else{
            temp1 = p1.next;
            temp2 = temp1.next;
        }
        
        temp1.next = null;
        while(temp2 != null){
            temp3 = temp2.next;
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
        }
        
        tail.next = temp1;
        
        
        
    }
}
