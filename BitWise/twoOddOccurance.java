public class twoOddOccurance {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,2,4,4,5,5,5,5,7};
        twoOdd(arr);
    }
    public static void twoOdd(int arr[]){
        int x = arr[0];
        int res1=0;
        int res2=0;
        for (int i = 1; i < arr.length; i++) {
        x = x^arr[i];
        }
        int y = x & (~(x-1));
        for (int i = 0; i < arr.length; i++) {
            if((arr[i]&y)==0){
            res1 = res1^arr[i];
            }else{
            res2 = res2^arr[i];
        }
    }
    System.out.println(res1+" "+res2);
    }
}
