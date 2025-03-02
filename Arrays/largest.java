package Arrays;
import java.util.*;
public class largest {

    public static Void largest(int array[]){
            int maxvalue=Integer.MIN_VALUE;
            int smallvalue=Integer.MAX_VALUE;        
            for(int i=0;i<array.length;i++){
                if(maxvalue<array[i]){
                    maxvalue=array[i];
                }
                if(smallvalue>array[i]){
                    smallvalue=array[i];
                }
            }
            System.out.println("largest value is :" + maxvalue);
            System.out.println("minimum value is "+ smallvalue);
            return null;  // import to remember

    }
    public static void main(String[] args) {
        int array[]={2,6,4,8,2};
        largest(array);
    }
}
