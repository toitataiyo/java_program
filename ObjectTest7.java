class Point2D {
    double x, y;
    Point2D(double xx, double yy){
        x=xx; y=yy;
    }
    double length(){
        return Math.sqrt(x*x+y*y);
    }
    double distance2d(Point2D point2){
        double dx=(x-point2.x), dy=(y-point2.y);
        return Math.sqrt(dx*dx+dy*dy);
    }
}

/**
 * Point3D extends Point2D
 */
class Point3D extends Point2D {
    double z;
    Point3D(double xx, double yy, double zz){
        super(xx, yy);
        z=zz;
    }
    double length(){
        return Math.sqrt(x*x+y*y+z*z);
    }
}

public class ObjectTest7 {
    public static void main(String[] args) {
        Point3D p1, p2, p3;
        p1 = new Point3D(0.0, 0.0, 1.0);
        p2 = new Point3D(1.0, 1.0, 1.0);
        p3 = new Point3D(0.0, 1.0, 1.0);
        System.out.println("length of p1 = "+p1.length());
        System.out.println("length of p2 = "+p2.length());
        System.out.println("length of p3 = "+p3.length());
    }
}
