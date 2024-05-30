class Point2D {
    double x, y;

    double distance2D(Point2D point2){
        double dx=(this.x-point2.x), dy=(this.y-point2.y);
        return Math.sqrt(dx*dx+dy*dy);
    }

    double length(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
}

public class ObjectTest4 {
    public static void main(String[] args) {
        Point2D p1, p2, p3;
        p1=new Point2D();
        p1.x=0.0;
        p1.y=0.0;
        p2=new Point2D();
        p2.x=1.0;
        p2.y=1.0;
        p3=new Point2D();
        p3.x=0.0;
        p3.y=1.0;
        System.out.println("length of p1 = "+p1.length());
        System.out.println("length of p2 = "+p2.length());
        System.out.println("length of p3 = "+p3.length());
        System.out.println("distance between p1 and p2 "+p1.distance2D(p2));
        System.out.println("distance between p2 and p3 "+p2.distance2D(p3));
        System.out.println("distance between p3 and p1 "+p3.distance2D(p1));
    }
}
