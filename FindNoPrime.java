public class FindNoPrime {
    public static void main(String[] args) {
        int sum=0,num;
        int i,j;

        toploop: for(i=0;i<args.length;i++){
            num=Integer.parseInt(args[i]);
            if(num<=1) continue;
            for(j=2;j*j<=num;j++){
                if(num%j==0){
                    System.out.println("合成数"+num+"を見つけました");
                    break toploop;
                }
            }
        }
        if(i==args.length)
        System.out.println("合成数は見つかりませんでした");
    }
}
