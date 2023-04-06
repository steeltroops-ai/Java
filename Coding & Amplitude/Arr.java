public class Arr {
    public static void main(int[] arr) {
        int start = arr[0];
        int end = arr[arr.length-1];
        while(start<end){
            int temp = start;
            start = end;
            end = temp;
            start++;
            end--;
        }

    }
    
}
