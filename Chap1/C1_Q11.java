import java.util.Scanner;

public class C1_Q11 {
    public static void main(String[] args){

        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int result = 0;

        for(int i = 1; i <= n; i*=10){
            result += 1;
        }

        System.out.println(result);
    }

}
