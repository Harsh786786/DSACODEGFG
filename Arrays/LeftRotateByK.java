public class LeftRotateByK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotate(arr, 2);
    
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void rotate(int arr[], int k){
        rev(arr,0,k-1);
        rev(arr,k,arr.length-1);
        rev(arr,0,arr.length-1);
    }
    public static void rev(int arr[], int start, int end){
        while(start<=(end/2)){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
