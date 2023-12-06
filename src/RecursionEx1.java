import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionEx1 {
    // Recursion Exercise 1 
    public static Double max(Double[]x, int low, int high) {
        if (low==high) {
            return x[low];
        }
        int mid = (low+high)/2;
        Double max1=max(x,low,mid);
        Double max2=max(x,mid+1,high);
        if (max1>=max2) {
            return max1;
        }
        else {
            return max2;
        }
    }
    public static void main (String[] args) throws Exception {
        InputStreamReader skeleton = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(skeleton);
        System.out.println("Please enter all the numbers seperated by comma only, no spaces:");
        String answer = reader.readLine();
        String[] arr = answer.split(",");
        int n = arr.length;
        Double[] arr1 = new Double[n];
        for (int i=0;i<n;i+=1) {
            arr1[i]=Double.parseDouble(arr[i]);
        }
        Double ultimate = max(arr1,0,n-1);
        System.out.println(ultimate);
    }
}
