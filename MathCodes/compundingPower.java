public class compundingPower {

    public static void main(String[] args) {
        System.out.println(poe(3,7));
    }
    public static int pow(int m , int n){
        if(n==0){
            return 1;
        }
        int temp = pow(m, n/2);
        temp = temp*temp;
        if(n%2==0){
            return temp;
        }
        return temp*m;

    }
    public static int poe(int m , int n){
        int ans =1;
        while(n>0){
            if(n%2!=0){
                ans = ans*m;
            }
            m = m*m;
            n=n/2;
        }
        return ans;
    }
}
