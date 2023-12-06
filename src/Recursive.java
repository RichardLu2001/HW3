public class Recursive {
    public static void fun (int m, int n) {
        if (n>0) {
            fun(n-1,m-2);
            if (m<4) {
                fun(n,m);
                System.out.println(m);
            }
        }
    }

    public static void main (String[] args) {
        fun (2,7);
    }
}
