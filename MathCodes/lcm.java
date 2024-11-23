public class lcm {
    public static void main(String[] args) {
        System.out.println(lcm(13120, 486760));
    }
    public static long lcm(long n , long m){
        long a = n*m;
        while(n>0 && m>0){
            if(n>m){
                n = n%m;
            }else{
                m = m%n;
            }

        }        
        if(n>0){
            return a/n;
        }

        return a/m;

}
}
