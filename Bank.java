public class Bank {
    public static void main(String[] args) {
        int year;
        int i;
        double rate=1.05;
        double money=Integer.parseInt(args[0]);
        for (i=1;i<=10;i++){
            rate=1.00+i*0.1;
            money=10000.0;
            for (year=0;year<100;year++){
                money=money*rate;
            } 
        
        System.out.println(i+"%の利子で"+year+"年後の預金は"+money+"円です");
        }
    }
}
