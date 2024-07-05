package sample_program;

public class ConcatSample2 {
    public static void main(String[] args) {
        String str1 = "文字列1";
        String str2 = "文字列2";
        String str = str1.concat(str2);
        System.out.println("String.concatによる文字列の連結 -> " +str);
    }
}
