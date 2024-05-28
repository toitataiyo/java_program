public class Test11_3 {
    static void spaces(int l){
        if(l==0) return;
        System.out.print(" ");
        spaces(l-1);
    }
    static void star(){
        System.out.print("*");
    }
    public static void main(String[] args) {
        int y;
        for(y=0;y<6;y=y+1){
            spaces(y);
            star();
            spaces(10-y*2);
            star();
            System.out.println();
        }
    }
}
