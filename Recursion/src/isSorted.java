public class isSorted {

    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurance(int[]arr,int i,int target){
        if(i==arr.length) return -1;
        if(arr[i]==target) return i;
        return firstOccurance(arr,i+1,target);
    }

    public static int lastOccurance(int[]arr,int i,int target){
        if(i==arr.length) return -1; //base case
        int isFound=lastOccurance(arr,i+1,target);
        if(isFound!=-1 && arr[i]==target){
            return i;
        }
        return isFound;
    }

    public static int power(int n,int x){
        if(n==0) return 1;
        return x*power(n-1,x);
    }
    public static int power2(int n,int x){
        if(n==0) return 1;
        int power=power2(n/2,x)*power2(n/2,x);
        if(n%2!=0){
            return x*power;        }
        return power;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.print(isSorted(arr,0));
        System.out.println();
        System.out.println(firstOccurance(arr,0,4));
        System.out.println(power(3,3));
        System.out.println(power2(3,3));
    }
}
