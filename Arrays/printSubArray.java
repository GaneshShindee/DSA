package Arrays;
public class printSubArray {

    public static void printSubArray(int arr[]){
        int maxsub=Integer.MIN_VALUE;
        int sum=0;
        int min=0;
        int minsub=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    min=0;
                    min=+arr[k];
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                    if(sum>maxsub){
                        maxsub=sum;
                    }
                    if(min<minsub){
                        minsub=min;
                    }
                    
                }System.out.println();
            }
            
        }
        System.out.println("Maximum sum is : " +maxsub);
        System.out.println("Minimum Sum is : "+minsub);

    }


    public static void printSubArrayusingprefix(int arr[]){
        int maxsub=Integer.MIN_VALUE;
        int sum=0;
        int min=0;
        int minsub=Integer.MAX_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(i==0){
                    sum=prefix[j];
                }
                else{
                    sum=prefix[j]-prefix[i-1];
                }
                if(sum>maxsub){
                    maxsub=sum;
                }                    
            }
            
        }
      
        System.out.println("Maximum sum is : " +maxsub);
        // System.out.println("Minimum Sum is : "+minsub);

    }


    public static void printSubArrayusingkadan(int arr[]){
        int maxsub=Integer.MIN_VALUE;
        int sum=0;


        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            maxsub=Math.max(sum,maxsub);
        }
        
      
        System.out.println("Maximum sum is : " +maxsub);
        // System.out.println("Minimum Sum is : "+minsub);

    }




    public static void main(String[] args) {

        int arr[]={2,4,6,8,10};
        // printSubArray(arr);
        // printSubArrayusingprefix(arr);
        printSubArrayusingkadan(arr);
        
    }
    
}
