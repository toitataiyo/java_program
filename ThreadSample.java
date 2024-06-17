public class ThreadSample {
    public static void main(String[] args) {
        ExtnOfThread t1 = new ExtnOfThread();
        t1.start();
        Thread t2=new Thread(new ImplOfRunnable());
        t2.start();
    }
}

class ExtnOfThread extends Thread{
    public void run(){
        System.out.println("Extension of Thread running");
        try{sleep(1000);}
        catch(InterruptedException ie){return;}
        System.out.println("Extension of Thread exiting");
    }
}

/**
 *  ImplOfRunnable implements Runnable
 */
class  ImplOfRunnable implements Runnable {
    public void run(){
        System.out.println("Implementation of Runnable running");
        try{Thread.sleep(1000);}
        catch (InterruptedException ie){return;}
        System.out.println("Implementation of Runnable exiting");
    }
}
