import java.util.Scanner;

public class C2_Q4 {
    static void copy(int[] a, int[] b){
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = stdin.nextInt();
        }

        copy(arr, arr1);

        for(int i = 0; i < n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
