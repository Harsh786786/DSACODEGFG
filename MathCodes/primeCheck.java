import java.util.Arrays;

public class primeCheck {
    public static void main(String[] args) {
        primeFactors(749650);
    }
    public static boolean check(int n){
        boolean ans = true;
        for(int i=2;i*i<=n;i++){
            if((((n%i)==0) && (i!=n))){
                ans = false;
                break;
            }
        }

        return ans;

    }

    public static void primeRange(int n){
        boolean arr [] = new boolean [n+1];
        Arrays.fill(arr, true);

        for (int i = 2; i<arr.length ; i++) {
            if( arr[i]){
            for (int j = 2; j*i <arr.length ; j++) {
                arr[i*j]= false;
            }
        }
            
        }
        for (int i = 2; i < arr.length; i++) {
            System.out.println(i +" is " + arr[i]);
        }

    }

    public static void primeFactors(int n){
        for (int i = 2; i<= n; i++) {
                    while(n%i==0){
                        if(check(i)){
                            System.out.println(i);
                            
                        }
                        n=n/i;
                       
                    }
        }
    }
}
