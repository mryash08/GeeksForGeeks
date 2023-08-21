//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
    
        int[] freq = new int[1000001];
         ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length; i++) freq[arr[i]]++;
        for(int i=0; i<freq.length; i++) if(freq[i] > 1) ans.add(i);
         if(ans.size() == 0)  ans.add(-1);
           
        return ans;
    }
}
