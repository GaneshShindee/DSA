package Arrays;

public class maxprofit {

    public static void maxProfit(int arr[]){
        int lowprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(lowprice>arr[i]){
                lowprice=arr[i];
            }
            if(lowprice<arr[i]){
                int Profit=arr[i]-lowprice;
                maxProfit=Math.max(maxProfit,Profit);
            }

        }
        System.out.println(maxProfit);

    }

    public static void main(String[] args) {
        int arr[]={4,2,3,5,6,7,8,25};
        maxProfit(arr);
    }
}
