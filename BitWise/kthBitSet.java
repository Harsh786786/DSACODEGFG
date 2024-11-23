public class kthBitSet {

    public static void main(String[] args) {
        System.out.println(check2(345, 3));
    }
    public static boolean check(int n , int k){
        if((n & (1 <<(k-1)) )!= 0){
            return true;
        }
        return false;
    }
    public static boolean check2(int n , int k){
        if((1 & (n >>(k-1)) )!= 0){
            return true;
        }
        return false;
    }
}