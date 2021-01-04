import java.util.Scanner;

public class C1_Q3 {

    static int min4(int a, int b, int c, int d){
        int min = a;

        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        if(min > d){
            min = d;
        }

        return min;

    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int c = stdin.nextInt();
        int d = stdin.nextInt();

        int result = min4(a,b,c,d);

        System.out.println(result);


    }

}
