public class gcdHcf{

    public static void main(String[] args) {
        System.out.println(gcd(1004,40 ));
    }
    public static int gcd(int n , int m){
        while(n>0 && m>0){
            if(n>m){
                n = n%m;
            }else{
                m = m%n;
            }

        }        
        if(n>0){
            return n;
        }
        return m;


}
}