/**
 * Created by sahilkaw on 3/31/17.
 */


class RunnableDemo implements Runnable {

    public Thread t;
    public String ThreadName;

    RunnableDemo(String name){
        ThreadName = name;
        System.out.println("Creating Thread" + ThreadName);
    }

    @Override
    public void run() {
    System.out.println("Running " + ThreadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + ThreadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread: " + ThreadName + " existing");
    }

    public void start(){
        System.out.println("Starting " + ThreadName);
        if(t==null){
            t = new Thread(this, ThreadName);
            t.start();
        }
    }
}

public class TestThread{
    public static void main(String [] args){
        RunnableDemo t1 = new RunnableDemo("Thread-1");
        t1.start();
        RunnableDemo t2 = new RunnableDemo("Thread-2");
        t2.start();
    }

}

