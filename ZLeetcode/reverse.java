package ZLeetcode;

public class reverse {
    public static void main(String[] args) {
        String s="The Sky is Blue";
        String[] words=s.split("\\s+");
        System.out.println(words.length);
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
}
