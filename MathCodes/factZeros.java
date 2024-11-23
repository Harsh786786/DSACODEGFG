public class factZeros {
    public static void main(String[] args) {
     System.out.println(zero(120));   
    }
    public static int zero(int n){
        int ans=0;
        
        for(int i=5; i<=n; i=i*5){
            ans = ans + n/i;
        }

        return ans;
    }
}
