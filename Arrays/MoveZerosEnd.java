public class MoveZerosEnd {
    public static void main(String[] args) {
        int arr[] ={10,0,1,0,110,103};
        moveZeroLinear(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void moveZero(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j]!=0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
    }
    public static void moveZeroLinear(int arr[]){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] =arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
