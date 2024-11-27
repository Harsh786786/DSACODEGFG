public class LeadersArray {
    public static void main(String[] args) {
        int arr[] = {10,2,12,34,54,67,123,45,12,34};
        leaders(arr);
    }
    public static void leaders(int arr[]){
        int currentLeader = arr[arr.length-1];
        System.out.print(currentLeader+" ");
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i]>currentLeader){
                currentLeader = arr[i];
                System.out.print(currentLeader+" ");
            }
        }
    }
}
