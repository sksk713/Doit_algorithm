import java.util.Scanner;

public class C1_Q8 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        int result = (1+n)*n/2;
        System.out.println(result);
    }
}
