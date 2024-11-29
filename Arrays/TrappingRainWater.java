public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {3,0,1,2,5};
        System.out.println(trap(arr));
    }

    public static int trap(int arr[]){
        int lmaxar [] = new int [arr.length];
        int rmaxar [] = new int [arr.length];
        lmaxar[0] = arr[0];
        rmaxar[arr.length-1] = arr[arr.length-1];
        int ans =0;
        for (int i = 1; i < arr.length; i++) {
            lmaxar[i] = Math.max(lmaxar[i-1], arr[i]);
        }

        for (int i = arr.length-2; i >= 0; i--) {
            rmaxar[i] = Math.max(lmaxar[i+1], arr[i]);
        }

        for (int j = 0; j < arr.length; j++) {
            ans = ans + (Math.min(lmaxar[j], rmaxar[j])- arr[j]);
        }
        return ans;

    }
}
