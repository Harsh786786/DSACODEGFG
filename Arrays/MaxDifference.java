public class MaxDifference {
    public static void main(String[] args) {
        int arr[] ={30,10,8,2};
        System.out.println(maxDiff(arr));
    }
    public static int maxDiff(int arr[]){
        int ans = arr[1]-arr[0];
        int minValue= arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = Math.max(ans, arr[i]-minValue);
            minValue = Math.min(minValue, arr[i]);
            
        }
        return ans;
    }
}
