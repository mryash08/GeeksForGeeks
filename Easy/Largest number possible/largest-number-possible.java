//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int N, int S){
       if(N ==1 && S == 0)return String.valueOf(0);
        int calucalate = N*9;
        if(calucalate < S || S < 1) return String.valueOf(-1);
        S = calucalate - S;
        String ans = "";
        for(int i=0; i<N; i++){
            if (9 < S){
                S -= 9;
                ans = '0' + ans;
            }else if (S == 0){
                ans = '9' + ans;
            }else {
                int differ = 9 - S;
                S = 0;
                ans = differ + ans;
            }
        }
       return ans;
    }
}