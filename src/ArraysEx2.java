import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraysEx2 {
    // Arrays Exercise 2
    public static void main (String[] args) throws Exception {
        InputStreamReader skeleton = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(skeleton);
        System.out.println("Please enter all strings together, seperated by SPACES ONLY, NO COMMA:");
        String all = reader.readLine();
        String[] arr = all.split(" ");
        int n = arr.length;
        int[] length = new int[n];
        for (int i=0;i<n;i+=1) {
            length[i] = arr[i].length();
        }
        for (int i=0; i<n-2; i+=3) {
            int index;
            int minlength = Math.min(Math.min(length[i],length[i+1]),length[i+2]);
            if (minlength==arr[i].length()) {
                index = i;
            }
            else if (minlength==arr[i+1].length()) {
                index = i+1;
            }
            else {
                index = i+2;
            }
            System.out.print(arr[index]+" ");
        }
    }
}
