import java.util.Scanner;

public class C3_Q2 {

    static int seqSearchSen(int[] a, int num, int key){
        int i = 0;

        while(true){
            for(int j = 0; j < a.length; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
            System.out.println("idx:"+ i +"를 탐색합니다");
            if(a[i] == key){
                break;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수：");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요솟수 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾는 값："); // 키 값을 입력 받음
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은 " + "x[" + idx + "]에 있습니다.");
    }
}
