public class PrimeWithBool {
    public static void main(String[] args) {
        int n=1000, i, k;
        boolean p[]= new boolean[n+1];
        for (i=2; i<p.length; i++) p[i]=true;
        for (i=2; i<p.length; i++)
        if (p[i]) {
            System.out.print(i+" ");
            for(k=2; i*k<=n; k++) p[i*k]=false;
        }
    }
}
