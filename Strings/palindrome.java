public class palindrome {

    public static boolean palindrome(String str, int end){
        int start=0;
        boolean polindrome=true;
        while (start<end){
            if(str.charAt(end) != str.charAt(start)){
                polindrome=false;
//                return false;
                break;
            }
            start++;end--;
        }
        return polindrome;
    }


    public static void main(String[] args) {
        String str="madam";
        System.out.println("hello");
        int end=str.length()-1;
        boolean pali =palindrome(str,str.length()-1);

        if(pali){
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not palindrome");
        }
    }
}
