public class StringCompression {
    public static String  stringCompression(String str){
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb=new StringBuilder("");
        Integer count=1;
        for(int i=1;i<str.length();i++){
            char ch=str.charAt(i);
//            sb.append(ch);
            if(str.charAt(i)==str.charAt(i-1) && i<str.length()){
                count++;
            }
            else{
                sb.append(str.charAt(i-1));
                sb.append(count.toString());
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="abbcccddddeeeee";
        System.out.println(stringCompression(str));

    }
}
