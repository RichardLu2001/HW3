import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraysEx1 {
    // Arrays Exercise 1
    public static void main(String[] args) throws Exception {
        InputStreamReader skeleton = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(skeleton);
        System.out.println("Please enter the two strings seperated by comma only:");
        String source = reader.readLine();
        String stitches = source.replaceAll("\\s", "").replaceAll(",","").toLowerCase();
        int n = stitches.length();
        int result = 1;
        if (n%2!=0) {
            result = 0;
        }
        else {
            for (int i=0;i<n/2;i+=1) {
                if (stitches.charAt(i)!=stitches.charAt(n-1-i)) {
                    result = 0;
                }
            }
        }
        System.out.println(result);
        reader.close();
    }
}
