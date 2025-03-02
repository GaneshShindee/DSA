package Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class linearSearch {

    public static void arrayInput(int array[],int size){
        for (int i =0;i<array.length;i++){
            Scanner sc =new Scanner(System.in);
            array[i]=sc.nextInt();
        }
    }

    public static int search(int array[],int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter size of an Array :");
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int[] array=new int[size];
        arrayInput(array, size);
        int key=sc.nextInt();
        System.out.println(search(array, key));
        
    }
}
