import java.util.Scanner;

public class C1_Q15 {
    static void triangleLB(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleLU(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRB(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRU(int n){
        for(int i = 0; i < n; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int T = stdin.nextInt();

        triangleRB(T);

    }
}
