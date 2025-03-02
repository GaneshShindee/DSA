public class recursionn {

    public static void printDec(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);

    }

    public static void printinc(int n){

        if(n==1) {
            System.out.print(n+" ");
            return;
        }
        printinc(n-1);

        System.out.print(n+" ");

    }

    public static int printFact(int n){
        if(n==0){
            return 1;
        };
        return n*printFact(n-1);
//        return 0;
    }

    public static int sum(int n){
        if(n==1) return 1;//base case
        int summ=n+sum(n-1);
        return summ;
    }

    public static int fib(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        printDec(n);
        printinc(n);
        System.out.println();
        System.out.println(printFact(3));
        System.out.println(sum(5));
        System.out.println(fib(5));


    }
}
