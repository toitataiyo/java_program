public class SqrtSum {
    public static void main(String[] args) {
        double sum=0.0;
        int i, num;
        for(i=0;i<args.length; i++){
            num=Integer.parseInt(args[i]);
            if(num<=0) continue;
            sum=sum+Math.sqrt(num);
        }
        System.out.println("sum="+sum);
    }
}
