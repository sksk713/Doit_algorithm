import java.util.Scanner;

public class C1_Q2 {

    static int min3(int a, int b, int c){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }

        return min;

    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();

        int result = min3(a,b,c);

        System.out.println(result);


    }

}
