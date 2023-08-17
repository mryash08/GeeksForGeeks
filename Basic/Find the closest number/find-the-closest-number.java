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
		    
		    String line1 = br.readLine();
		    String []element = line1.trim().split(" ");
		    int n = Integer.parseInt(element[0]);
		    int target = Integer.parseInt(element[1]);
		    
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.findClosest(arr, n, target));
		        
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
     public static int findClosest(int arr[], int n, int target)
    {

        int start = 0;
        int end = n-1;
        int mid = 0;

        while(start<= end){
            mid = start+(end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

             int value;
             int value2;
             int ans1;
             int ans2;
             int ans3;
           if(mid == 0){
               value = Math.abs(arr[mid]-target); 
               ans1 = arr[mid];
           }else{
               value = Math.abs(arr[mid-1]-target);
               ans1 = arr[mid-1];
           }
          
           if(mid == n-1){
               value2 = Math.abs(arr[mid]-target); 
               ans3 = arr[mid];
           }else{
               value2 = Math.abs(arr[mid+1]-target);
               ans3=arr[mid+1];
           }
          
          int value1 = Math.abs(arr[mid]-target);
         ans2 = arr[mid];
          
          if(value < value1){
              
              if(value < value2){
                  return ans1;
              }else if(value == value2){
                  return ans3;
              }else{
                  return ans3;
              }
              
              
          }else if(value == value1){
              
             if(value1 < value2){
                  return ans2;
              }else if(value1 == value2){
                  return ans3;
              }else{
                  return ans3;
              }
              
              
          }else{
              
               if(value1 < value2){
                  return ans2;
              }else if(value1 == value2){
                  return ans3;
              }else{
                  return ans3;
              }
          }
    }
}

