public class Primes {
    public static void main(String[] args) {
        int n=1000, i, k;
        int p[] = new int[n+1];
        for (i=2; i<=n; i++) p[i]=1; //ここで配列の初期化
        for (i=2; i<=n; i++)
          if (p[i]==1){
            System.out.println(i+" ");
            for (k=2; i*k<=n; k++) p[i*k]=0;
          }
    }
}
