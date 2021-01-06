import java.util.Scanner;

public class C2_Q11 {

    int y;
    int m;
    int d;

    static int[][] mdays = {
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
            { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }


    C2_Q11(int y, int m, int d){
        this.y = y;
        this.m = m;
        this.d = d;
    }

    C2_Q11 after(int n){
        C2_Q11 data_after = new C2_Q11(this.y, this.m, this.d);
        data_after.d += n;

        while (data_after.d > mdays[isLeap(data_after.y)][data_after.m - 1]) {
            data_after.d -= mdays[isLeap(data_after.y)][data_after.m - 1];
            data_after.m++;
            if (data_after.m > 12) {
                data_after.y++;
                data_after.m = 1;
            }
        }
        return data_after;
    }

//    C2_Q11 before(int n){
//
//    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        int year = stdin.nextInt();
        int month = stdin.nextInt();
        int day = stdin.nextInt();

        C2_Q11 data = new C2_Q11(year, month, day);

        int n = stdin.nextInt();

        C2_Q11 data_after = data.after(n);
//        C2_Q11 data_before = data.before(n);

        System.out.printf("%d년 %d월 %d일",data_after.y, data_after.m, data_after.d);
//        System.out.printf("%d년 %d월 %d일",data_before.y, data_before.m, data_before.d);
    }
}
