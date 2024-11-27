public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] ={10,20,20,30,30,30};
        System.out.println(revDup(arr));
        for(int a: arr){
            System.out.print(a+" ");
        }

    }
    public static int revDup(int arr[]){
        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[c-1]!=arr[i]){
                arr[c]= arr[i];
                c++;
            }
        }
        return c;
    }
}
