

public class ConcatSample4 {
    public static void main(String[] args) {
        String str1 = "あいう";
        String str2 = "えお";
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        String str = sb.toString();
        System.out.println("StringBuilderによる文字列の連結->"+str);
    }
}
