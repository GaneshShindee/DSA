package Sorting;

import java.util.Arrays;

public class inbuildSort {

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int arr[]={2,5,3,4,8,9};
        Arrays.sort(arr);
        printArray(arr);
    }
}
