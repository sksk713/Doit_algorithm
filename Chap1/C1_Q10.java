import java.util.Scanner;

public class C1_Q10 {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("a의 값:");
        int a = stdin.nextInt();
        System.out.print("b의 값:");
        int b = stdin.nextInt();

        if(a >= b) {
            System.out.println("a보다 큰 값을 입력하세요");
            System.out.print("b의 값:");
            b = stdin.nextInt();
        }

        System.out.println(b-a);

    }
}
