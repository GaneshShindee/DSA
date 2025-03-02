package Arrays;

import java.util.*;

public class create {

    public static void update(int marks[]){
        marks[2]=12;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }

    public static void main(String[] args) {

        int marks[] =new int [4];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[3]=sc.nextInt();
        System.out.println("phy: "+marks[0]);
        System.out.println("che : " + marks[1]);
        marks[1]=99;
        System.out.println("maths : "+ marks[2]);

        update(marks);
        System.out.println("maths : "+ marks[2]);

        sc.close();
        for(int i =0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}





