import java.io.*;
public class AnswerMonthWithArray {
    public static void main(String[] args) throws IOException{
        BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("月(1-12)を入力してください ");
        System.out.flush();
        String s=d.readLine();
        int month=Integer.parseInt(s);

        String mnames[]={"January", "February", "March", "April", "May", "June",
        "July","August","September","October",
        "November","December"};
        if(1<=month && month<=12)
          System.out.println(month+"月は "+mnames[month-1]+" です. ");
        else
          System.out.println(month+"月はありません");
    }
}
