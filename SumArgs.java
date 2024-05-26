public class SumArgs {
    public static void main(String[] args){
        int sum=0, num;
        int i;
        for(i=0; i< args.length; i++){
            num=Integer.parseInt(args[i]);
            if(num<=0) break;
            sum=sum+num;
        }
        System.out.println("sum="+sum);
    }
}
