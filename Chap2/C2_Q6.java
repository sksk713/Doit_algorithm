import java.util.Scanner;

public class C2_Q6 {
    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(x != 0);

        for(int i = 0; i < digits/2; i++){
            char t = d[i];
            d[i] = d[digits - 1 - i];
            d[digits - 1 - i] = t;
        }
        return digits;
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수를 기수변환");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수:");
                no = stdin.nextInt();
            } while(no < 0);

            do {
                System.out.print("어떤 진수 0~36: ");
                cd = stdin.nextInt();
            } while(cd > 2 || cd >36);

            dno = cardConvR(no, cd, cno);

            System.out.print(cd + " 진수로는 ");
            for(int i = 0; i < dno; i++){
                System.out.print(cno[i]);
            }
            System.out.print("한번 더? o1 x0 ");
            retry = stdin.nextInt();
        } while(retry == 1);
    }
}
