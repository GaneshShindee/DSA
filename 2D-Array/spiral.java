public class spiral {

   public static void printSpiral(int[] [] matrix){
       int startrow=0;
       int endrow=matrix.length-1;
       int startcol=0;
       int endcol=matrix[0].length-1;

       while(startrow<=endrow && startcol==endcol){
           //top
           for(int j=startcol;j<endcol;j++){
               System.out.println(matrix[startrow][j]+" ");
           }
           for(int i= startrow+1;i<endrow;i++){
               System.out.println(matrix[i][endcol]+" ");
           }
           for(int i= endcol-1;i<startcol;i++){
               System.out.println();
           }
           for(int i= endrow-1;i<startrow   ;i++){
               System.out.println();
           }
       }
   }

    public static void main(String[] args) {
        int matric [] []={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
    }
}
