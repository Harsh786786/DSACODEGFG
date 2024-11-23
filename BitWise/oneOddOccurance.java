public class oneOddOccurance {
    public static void main(String[] args) {
        int arr [] = {1,1,3,3,4,4,4,4,1,1,45,5,5};
        System.out.println(oddOne(arr));
    }
    public static int oddOne(int [] arr) {
        int ans = arr[0];
        for (int i=1 ;i<arr.length;i++) {
            ans = ans^arr[i];
        }
        return ans;
    }
}
