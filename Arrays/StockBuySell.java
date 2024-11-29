public class StockBuySell {
    public static void main(String[] args) {
        
        int arr[] ={10,20,30};
        System.out.println(profit(arr));
    }
    public static int profit(int arr[]){
        int ans=0;
        

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]){
                ans  = ans+ (arr[i]-arr[i-1]);
            }
        }
        return ans;



       

    }
}
