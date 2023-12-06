import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionEx2 {
    // Recursion Exercise 2
    private static int count = 0;
    public static void countzeroes(int n) {
        if (n>=1) {
            if (n%2 ==0) {
                count+=1;
            }
            countzeroes(n/2);
        }
    }

    public static void main (String[] args) throws Exception {
        InputStreamReader skeleton = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(skeleton);
        System.out.println("Please enter the integer N:");
        int N = Integer.parseInt(reader.readLine());
        countzeroes(N);
        System.out.println(count+"(assume no leading zeroes)");
    }
}