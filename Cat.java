import java.io.*;

public class Cat {
    public static void main(String[] args) throws IOException{
        BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=is.readLine())!=null){
            System.out.println(s);
        }
    }
}
