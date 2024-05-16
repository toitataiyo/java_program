import java.io.*;
/* 
class AnswerMonth{
  public static void main(String[] args) throws IOException{
  // 入力をするためには，System.inからBufferedReaderを作らなくてはいけない
    BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("月(1-12)を入力して下さい  ");
    // 入力をおこなう前に, バッファリングされていた出力を出してします
    System.out.flush();
    String s=d.readLine();
     // 文字列をint型に変換する. 
    int month=Integer.parseInt(s);
    // 入力した月が1より小さい時，12より大きい時は次の if 文を実行します
    if(month<1 || month>12) System.out.println(month+"月はありません");
    if(month==1) System.out.println("1月は January です. ");
    if(month==2) System.out.println("2月は February です. ");
    if(month==3) System.out.println("3月は March です. ");
    if(month==4) System.out.println("4月は April です. ");
    if(month==5) System.out.println("5月は May です. ");
    if(month==6) System.out.println("6月は June です. ");
    if(month==7) System.out.println("7月は July です. ");
    if(month==8) System.out.println("8月は August です. ");
    if(month==9) System.out.println("9月は Sepember です. ");
    if(month==10) System.out.println("10月は October です. ");
    if(month==11) System.out.println("11月は November です. ");
    if(month==12) System.out.println("12月は December です. ");
  }
}
*/

public class AnswerMonth {
    public static void main(String[] args) throws IOException{
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("月(1-12)を入力してください ");
        System.out.flush();
        String s=d.readLine();
        int month=Integer.parseInt(s);
        String mnames[]=new String[12];
        mnames[0]="January";
        mnames[1]="February";
        mnames[2]="March";
        mnames[3]="April";
        mnames[4]="May";
        mnames[5]="June";
        mnames[6]="July";
        mnames[7]="August";
        mnames[8]="September";
        mnames[9]="October";
        mnames[10]="November";
        mnames[11]="December";
        if(1<=month && month<=12)
          System.out.println(month+"月は "+mnames[month-1]+" です");
        else
          System.out.println(month+"月はありません");
    }
}

