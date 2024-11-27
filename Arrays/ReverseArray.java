public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2};
        revArray(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }
    public static void revArray(int arr[]){
        int i =0;
        int l = arr.length-1;
        while(i<=l){
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            i++;
            l--;
        }

    }
}
