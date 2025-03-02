import static java.lang.Math.sqrt;

public class shortestpath {


    public static float shortestPath(String str){
        int n= str.length();
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='E'){
                x=x-1;
            }
            else if(str.charAt(i)=='W'){
                x=x+1;
            }
            else if(str.charAt(i)=='N'){
                y=y+1;
            }
            else{
                y=y-1;
            }

        }
        int x2=x*x;
        int y2=y*y;
        int sum=x2+y2;
        return (float)Math.sqrt(x2+y2);

    }

    public static void main(String[] args) {

        String str[]={"apple","mango","banana"};
//        System.out.println(shortestPath(str));
        String largest=str[0];
        for(int i =0;i<str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);
    }
}
