public class ParseNumber {
    public static void main(String[] args) {
        String s="1000";
        int i=Integer.parseInt(s)+1;
        System.out.println(i);
        String s1="1000.1";
        double d=Double.parseDouble(s1) * 2.0;
        System.out.println(d);
    }
}
