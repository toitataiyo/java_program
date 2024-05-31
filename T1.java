class Point{
    int x,y;
    Point(int xx, int yy){x=xx; y=yy;}
}

public class T1 {
    static int getXandIncrement(Point p){
        int x=p.x;
        p.x++;
        return x;
    }
    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        System.out.println(getXandIncrement(p1));
        System.out.println(p1.x);
    }
}
