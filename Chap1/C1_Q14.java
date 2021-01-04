import java.util.Scanner;

public class C1_Q14 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int T = stdin.nextInt();

        for(int i = 1; i <= T; i++){
            for(int j = 1; j <= T; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
