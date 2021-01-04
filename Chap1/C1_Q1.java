import java.util.Scanner;

public class C1_Q1 {

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        if(max < d){
            max = d;
        }

        return max;
    }
    public static void main(String[] args){

       Scanner stdin = new Scanner(System.in);

       int a = stdin.nextInt();
       int b = stdin.nextInt();
       int c = stdin.nextInt();
       int d = stdin.nextInt();

       int max = max4(a, b, c, d);

       System.out.println(max);



    }
}
