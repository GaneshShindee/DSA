package Arrays;

import java.util.*;
public class binarySearch {

    public static int binarySearch(int array[],int key){
        int start=0;
        int end=array.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
             if(key==array[mid]){
                  return mid;
             }
             else if(key>array[mid]){
                start=mid+1;
             }
             else{
                end=mid-1;
             }
             mid = start+(end-start)/2;
    }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={2,3,4,6,8,9};
        Scanner sc= new Scanner(System.in);
        int key= sc.nextInt();
        int index=binarySearch(array,key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
        sc.close();

        }
    
}
