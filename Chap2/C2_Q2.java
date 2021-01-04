import java.util.Scanner;

public class C2_Q2 {
    static void swap(int[] a, int idx1, int idx2){
        int t = idx1;
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        for(int i = 0; i < a.length/2; i++){
            System.out.println(i + "번째와" + (a.length-1-i) + "번째 교환" );
            swap(a, i, a.length - 1 - i);
            for(int j = 0; j < a.length; j++){
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.print("넣을 요소의 개수: ");
        int n = stdin.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = stdin.nextInt();
        }
        reverse(arr);

;    }
}
