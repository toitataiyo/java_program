import java.io.*;
/*class CheckTanaka{
    // throws IOException で内部で入出力エラーが起きる可能性があることを示す
   public static void main(Str args) throws IOException{
   // 入力をするためには，System.inからBufferedReaderを作らなくてはいけない
     BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
     // 文字列型(String)の変数 family を定義
     String family;
     System.out.println("名字を入力してください> ");
     family=d.readLine();
     if(family == "tanaka"){
       System.out.println("あなたの名前はおそらく田中です(田仲かもしれません)．");
     }
   }
 }*/

public class CheckTanaka {
    public static void main(String[] args) throws IOException{
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        String family;
        System.out.println("名字を入力してください> ");
        family=d.readLine();
        if(family.equals("tanaka")){
            System.out.println("あなたの名前はおそらく田中です(田仲かもしれません). ");
        }
    }
}
