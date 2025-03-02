package Sorting;

public class selectionSort {

    public static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;           
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int n=5;
        for(int i =0;i<n-1;i++){
            int mini=i;
            for(int j=i;j<n;j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                }
            }
            swap(arr,mini,i);
        }
        print(arr);
    }
    
}
