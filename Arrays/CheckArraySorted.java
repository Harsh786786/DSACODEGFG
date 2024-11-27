public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[]={5};
        System.out.println(check(arr));
    }
    public static boolean check(int arr[]){
        boolean ans = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                ans = false;
                break;
            }
        }

        return ans;
    }
}
