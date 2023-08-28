//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int ZeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        
        Node temp = head;
        while(temp != null){
            
          if(temp.data == 0){
              ZeroCount++;
          }else if(temp.data == 1){
              oneCount++;
          }else{
              twoCount++;
          }
          
          temp = temp.next;
        }
        
        Node newHead = new Node(100);
        Node ans1 = newHead;
        
        while(twoCount + ZeroCount + oneCount  != 0){
              if(ZeroCount != 0){
              ZeroCount--;
              Node newHead1 = new Node(0);
              newHead.next = newHead1;
              
          }else if(oneCount != 0){
              oneCount--;
              Node newHead1 = new Node(1);
              newHead.next = newHead1;
              
          }else{
              twoCount--;
              Node newHead1 = new Node(2);
              newHead.next = newHead1;
          }
            newHead = newHead.next;
        }
        
      
        return ans1.next;
    }
}


