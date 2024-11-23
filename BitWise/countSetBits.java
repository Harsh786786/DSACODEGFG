public class countSetBits {
    public static void main(String[] args) {
        System.out.println(count(1000));
        System.out.println(compute(1000));
    }
    public static int count(int n){
        int ans= 0;
        while(n>0){
            if(n%2 != 0){
                ans++;
            }
            n=n/2;
        }
        return ans;
    }
    public static int compute(int n){
        int arr [] = new int [256];
        arr [0] =0;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i &  (i-1)] + 1;
        }
        return arr[n&255] + arr[(n>>8)& 255] + arr[(n>>16)&255] + arr[(n>>24)& 255];
    }
}
