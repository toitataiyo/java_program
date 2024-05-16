public class StringTest {
    public static void main(String[] args) {
        String a=new String("tanaka");
        String b=a;
        String c=new String("tanaka");
        System.out.println("a==b -> "+(a==b));
        System.out.println("a==c -> "+(a==c));
        System.out.println("b==c -> "+(b==c));
    }
}
