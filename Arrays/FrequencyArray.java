public class FrequencyArray{
    public static void main(String[] args) {
        int arr[] ={10,10,20,35,35,46,46,78,78,78,98};
        freqEle(arr);
    }
    public static void freqEle(int arr[]){
        int freq = 1;
        int i =1;

        while(i<arr.length){
            while ( i<arr.length && arr[i]==arr[i-1]) {
                freq++;
                i++;
            
                }
            System.out.println("Freq of "+ arr[i-1]+" is "+ freq);
            freq =1;
            i++;
        }
        if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2]){
            System.out.println("Freq of "+ arr[arr.length-1]+" is "+ freq);
        }

    }
}