//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        
        
        int i=0;
        int j=n-1;
        long ans = -1;
        long sum1 = 0; long sum2 = 0;
        while(i < j){
            
            if(sum1 + arr[i] > sum2 + arr[j]){
                sum2 += arr[j];
                j--;
            }else if (sum1 + arr[i] == sum2 + arr[j]){
                sum2 += arr[j];
                sum1 += arr[i];
                i++;
                j--;
            }
            else{
                sum1 += arr[i];
                i++;
            }
            
            
            if(j == i && sum1 == sum2){
                return i+1;
            }
            
            
        }
        
        return -1;

    }
    
}
