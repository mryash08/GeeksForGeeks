//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{ 
    static int CountPairs (int arr[], int n) 
    {
        
        int totalPair = (n*n) - (n * (n+1)/2);
        int count = -1; int count2 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0 || arr[i] == 1){
                totalPair -= (n-1);
                count++;
            }
            if(arr[i] == 2){
                count2++;
            }
        }
        
        totalPair += (count * (count+1)/2);
        totalPair -= (count2*count2) - (count2 * (count2+1)/2);
        return totalPair;
        
        
    }
}


//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    Solution ob=new Solution();
		    int ans=ob.CountPairs(a,n);
		    System.out.println(ans);
		    
		}
	}
}

// } Driver Code Ends