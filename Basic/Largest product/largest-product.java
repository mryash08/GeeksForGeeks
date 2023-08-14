//{ Driver Code Starts
import java.util.*;
import java.lang.Math;


class Largest_Product_Subarray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[]  = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
				
			
			
			GfG g = new GfG();
			System.out.println(g.findMaxProduct(arr, n , k));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete the function*/
class GfG
{
    long findMaxProduct(int A[], int n, int k)
    {
        
        int ans = 0;
        for(int i=1; i<n; i++){
            A[i] = A[i] * A[i-1];
        }
        
        for(int i=k-1; i<n; i++){
            
            if(k-1 == i){
                ans = Math.max(ans,A[i]);
            }else{
                ans = Math.max(ans,A[i]/A[i-(k)]);
            }
        }
        

return (long)ans;


    }
}