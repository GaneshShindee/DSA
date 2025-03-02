package Arrays;

public class reverseArray {

    // public static void 

    public static void reverse(int arr[]){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int temp =arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        System.out.println("\n");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
