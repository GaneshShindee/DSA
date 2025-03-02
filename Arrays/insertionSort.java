package Arrays;

public class insertionSort {

    public static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int curr= i;
            int prev=i-1;
            while(prev>=0 && arr[i]<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=arr[curr];
        }
    }

    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minimum=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
            swap(arr,minimum,i);
        }


    }
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }



    public static void main(String[] args) {
        int arr[]={2,5,4,1,3,9};
        printArray(arr);
        System.out.println();
//      SelectionSort(arr);
        insertionSort(arr);

        System.out.println("Sorted Array is : ");
        printArray(arr);


    }
}
