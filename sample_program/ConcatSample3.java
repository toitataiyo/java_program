public class ConcatSample3 {
    public static void main(String[] args) {
        String str1 = "文字列1";
        String str2 = "文字列2";
        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb.append(str2);
        String str = sb.toString();
        System.out.println("StringBufferによる文字列の連結"+str);
    }
}
