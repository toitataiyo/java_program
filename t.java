/**
 * I
 
 public void bye(String s);
 public void hello(String s);*/
interface I {
    public void bye(String s);
    public void hello(String s);
}

class B implements I{
    B(){}
    public void hello(String s){
        System.out.println("Hello "+s+" in B");
    }
    public void bye(String s){
        System.out.println("bye"+s+" in B");
    }
}

class C{
    int val;
    C(int v){
        val=v;
    }
    int add(int x){
        val+=x;
        return val;
    }
}

class D extends C implements I{
    D(int v){
        super(v);
    }
    public void hello(String s){
        System.out.println("Hello "+s+" in D("+val+")");
    }
    public void bye(String s){
        System.out.println("Bye "+s+" in D("+val+")");
    }
}

public class t {
    static void callHello(I i, String s){
        i.hello(s);
    }
    static void callBye(I i, String s){
        i.bye(s);
    }
    public static void main(String[] args) {
        B b=new B();
        callHello(b, "B");
        D d=new D(3);
        callHello(d, args[0]);
        d.add(4);
        callHello(d, args[0]);
        callBye(b, args[0]);
        callBye(d, args[0]);
    }
}
