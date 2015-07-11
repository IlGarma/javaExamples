/**
 * Created by Garma on 11/07/2015.
 */
public class MySyncroThread implements Runnable {

    private static SyncronizedSum sum = new SyncronizedSum();
    private Thread mythread;

    public MySyncroThread(String threadName) {
        mythread = new Thread(this, threadName);
        mythread.start();
    }

    @Override
    public void run() {
        int a[]= {1,2,3,4,5};
        System.out.println(mythread.getName() + " is started");
        int summ = sum.getSum(a);
        System.out.println(mythread.getName() + ". The sum is " + summ);
    }

    public void waitUntilIsFinished() {
        try {
            mythread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
