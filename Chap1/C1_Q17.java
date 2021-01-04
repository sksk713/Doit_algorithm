import java.util.Scanner;

public class C1_Q17 {
    static void spira(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2-1; k++){
                System.out.printf("%d",i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int T = stdin.nextInt();

        spira(T);

    }
}

