//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    
		    if(obj.checkUnimodal(arr,n))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    
    static boolean checkUnimodal(int arr[], int n) 
    { 
        
         int i=0;
        
        while(i < arr.length-1 && arr[i] < arr[i+1] ) {
            i++;
        }
        while(i < arr.length-1 && arr[i] == arr[i+1] ) {
            i++;
        }
        while(i < arr.length-1 && arr[i] > arr[i+1] ) {
            i++;
        }
        
        if(i == arr.length-1){
            return true;
        }
        
        return false;
        
        
        
    } 
}

