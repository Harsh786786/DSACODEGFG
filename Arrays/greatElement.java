public class greatElement{
    public static void main(String[] args) {
        int [] arr = {42, 17, 89, 23, 56, 34, 78, 12, 91, 45, 67, 29, 3, 80, 62};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        System.out.println(findSecMax(arr));
    }
    public static int findMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]>max){
                max= arr[index];
            }
        }

        return max;
    }
    public static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]<min){
                min= arr[index];
            }
        }

        return min;
    }
    public static int findSecMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int ans = Integer.MIN_VALUE;
        for(int a: arr){
            if(a>max){
                int temp = max;
                max = a;
                ans = temp;

            }
            if(a<max && a>ans){
                ans = a;
            }
        }
        return ans;
    }

}