package Sorting;

public class bubbleSort {
    
    public static void main(String[] args) {

        int arr[]={5,4,1,3,2};
        int n=5;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }

        for(int i=0;i<n;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
