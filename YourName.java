import java.io.*;
public class YourName {
    public static void main(String[] args) throws IOException{
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        String family,given;
        System.out.println("名字を入力してください> ");
        family=d.readLine();
        System.out.println("名前を入力してください> ");
        given=d.readLine();
        System.out.println("あなたの名前は"+family+" "+given+"です");
    }
}
