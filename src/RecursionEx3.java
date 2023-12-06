import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionEx3 {
    // Recursion Exercise 3
    public static boolean isPal(String str, int low, int high) {
        if (low==high) {
            return true;
        }
        if ((str.charAt(low))!=(str.charAt(high))) {
            return false;
        }
        if (low < high-1) {
            return isPal(str,low+1,high-1);
        }
        return true;
    }
    public static void main (String[] args) throws Exception {
        InputStreamReader skeleton = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(skeleton);
        System.out.println("Please enter your word:");
        String ans = reader.readLine();
        String ans1 = ans.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(isPal(ans1,0,ans1.length()-1));
    }
}
