//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        int max = -1;
        for(int i=0;i<size; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        
        int[] arr = new int[max+1];
        for(int i=0; i<size; i++){
            arr[a[i]]++;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > (size/2)){
                return i;
            }
        }
        
        return -1;
    }
}