public class C3_Q1 {

    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;
    
        a[n] = key; // 마지막 배열값에 보초 추가
    

        for( ; ; ){
            if(a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }
    
}
