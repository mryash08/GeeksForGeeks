//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
       
       int tempnum = num;
       int addSum = 0;
       
       for(int i=0; tempnum > 0; i++){
           
           if(tempnum % 10 == 0){
               if(i==0){
                   addSum += 5;
               }else{
                   addSum += 5 * Math.pow(10,i);
               }
              
           }
           
           tempnum = tempnum/10;
       }
       
       return num + addSum;
    }
}