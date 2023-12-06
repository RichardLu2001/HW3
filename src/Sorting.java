import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting {
    public static void BubbleSort(int[] input) {
        int temp;
        boolean swapped;
        int size = input.length;
        for (int i=0;i<size-1;i++) {
            swapped = false;
            for (int j=0;j<size-(i+1);j++) {
                if (input[j]>input[j+1]) {
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                    swapped=true;
                }
            }
            System.out.println(Arrays.toString(input));
            if (swapped==false) {
                break;
            } 
        }
    }
    
    public static void BubbleSort1(int[] arr, int n) {
        if (n == 1) {
            return; 
        }
        int count = 0; 
        for (int i=0; i<n-1; i++) {
            if (arr[i] > arr[i+1]) { 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
                count = count+1; 
            } 
        }
        System.out.println(Arrays.toString(arr));
  
        if (count == 0) { 
            return; 
        }
        BubbleSort1(arr, n-1); 
    }
    
    public static void SelectionSort(int[] arr,int n) {
        int temp, min;
        for (int i=0;i<n;i+=1) {
            min = i;
            for (int j=i+1;j<n;j+=1) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min]=arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void InsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void MergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int m = (low+high)/2;
            MergeSort(arr, low, m);
            MergeSort(arr, m + 1, high);
            merge(arr, low, m, high);
            System.out.println(Arrays.toString(arr));       
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        System.out.println(Arrays.toString(arr));
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main (String[] args) throws Exception{
        InputStreamReader skeleton = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(skeleton);
        System.out.println("Please enter the integers to be sorted seperated by comma only, no spaces: ");
        String ans = reader.readLine();
        String[] arr = ans.split(",");
        int n = arr.length;
        int[] arr1 = new int[n];
        for (int i=0;i<n;i+=1) {
            arr1[i]=Integer.parseInt(arr[i]);
        }
        System.out.println("Please enter the serial number of the sorting method you want.");
        System.out.println("1.Bubble Sort(non-recursive) 2.Bubble Sort(recursive) 3.Selection Sort(non-recursive) 4.Insertion Sort(non-recursive) 5.Merge Sort(recursive) 6.Quick Sort(recursive)");
        String ans1 = reader.readLine();
        if (ans1.equals("1")) {
            BubbleSort(arr1);
        }
        else if (ans1.equals("2")) {
            BubbleSort1(arr1,n);
        }
        else if (ans1.equals("3")) {
            SelectionSort(arr1, n);
        }
        else if (ans1.equals("4")) {
            InsertionSort(arr1,n);
        }
        else if (ans1.equals("5")) {
            MergeSort(arr1,0,n-1);
        }
        else if (ans1.equals("6")) {
            QuickSort(arr1,0,n-1);
        }
    }
}
