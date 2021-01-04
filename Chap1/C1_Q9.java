import java.util.Scanner;

public class C1_Q9 {
    static int sumof(int a, int b){
        int result = 0;
        if (a > b){

            for(int i = b; b <= a ; b++) {
                result += b;
            }
            return result;
        }
        else if (a < b){
            for(int i = a; a <= b; a++){
                result += a;
            }
            return result;
        }
        else
            return a;
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int a = stdin.nextInt();
        int b = stdin.nextInt();

        int result = sumof(a, b);
        System.out.println(result);
    }

}
