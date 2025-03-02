package Arrays;

public class trappingrainwater {

    public static void trappedWater(int height[]){
        //left max
        int n= height.length;
        // we have to create an helper array
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        //right max
        int rightmax[]=new int[height.length];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i] );
        }
        //water level
        int trappedwater=0;
        //trapped water
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        System.out.println(trappedwater);
    }

    public static void main(String[] args) {

        int arr[]={4,2,0,6,3,2,5};
        System.out.println("hello");
        trappedWater(arr);
    }
}
