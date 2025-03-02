package Arraylist;

import java.util.*;
import java.util.Collections;

class arrayy {

    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args) {
        // Arraylist <Float> floastt =new Arraylist<>();
        ArrayList <Integer> List= new ArrayList<>();
        ArrayList <String> List2= new ArrayList<>();
        ArrayList <Boolean> List3= new ArrayList<>();


        List.add(2);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);


        List.add(5);

        System.out.println(List);
        System.out.println(List.get(0));


        //remove
        List.remove(0);
        System.out.println("element at index 0 is "+List);



        //set

        //.size()
        System.out.print("size of my array list is: ");
        System.out.println(List.size());

        System.out.print("Array list Looks like: ");
        for(int i=0;i<List.size();i++){
            System.out.print(List.get(i)+" ");
        }
        System.out.println();
        //Reverse of arrray
        System.out.print("reverse array:-");
        for(int i=List.size()-1;i>=0;i--){
            System.out.print(List.get(i)+" ");
        }

        System.out.println();
        //maximum number
        int max=Integer.MIN_VALUE;
        for (int i=0;i<List.size();i++){
            if(List.get(i)>max){
                max=List.get(i);
            }
        }
        System.out.println("Maximum Value is "+max);

        //swap two numbers
        System.out.println("My list looks like "+List);
        swap(List,0,1);
        System.out.println("After swapping the list : "+List);

        //sorting
        Collections.sort(List);
        System.out.println("List after sorting arrtlist : "+ List);
    }
}