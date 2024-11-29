public class MaxOnes {
    public static void main(String[] args) {
        int arr []= {0,0,0,1};
        System.out.println(max(arr));
    }
    public static int max(int arr[]){
        int ans =0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {   
        if(arr[i]!=0){
            count++;
            ans = Math.max(ans, count);
            

        }else{
            count=0;
        }
    }

        return ans;
    }
}
