import java.util.Random;
//import java.util.Scanner;

public class C2_Q1 {
    static int maxof(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Random rand = new Random();
//        Scanner stdin = new Scanner(System.in);

        int num = 1 + rand.nextInt(10);

        int[] height = new int[num];

        for(int i = 0; i < num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] :" + height[i]);

        }

        System.out.println("최댓값은:" + maxof(height));


    }
}
