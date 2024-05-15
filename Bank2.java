public class Bank2 {
    public static void main(String[] args) {
        int year;
        double rate=1.05;
        double money=10000.0;
        for(year=0;money<100000.0;year++){
            money=money*rate;
        }
        System.out.println(year+"年後の預金は"+money+"円です");
    }
}
