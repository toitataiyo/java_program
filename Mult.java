public class Mult {
    public static void main(String[] args) {
        int i,v=3;
        for (i=0;i<100;i++)
          if((i % v)==0)
            System.out.println(i+"は"+v+"の倍数です");
          else
            System.out.println(i+"は"+v+"の倍数ではありません");
    }
}
