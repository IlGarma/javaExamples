/**
 * Created by Garma on 11/07/2015.
 */
public class MySyncroThread2 implements Runnable{

    private Thread mythread;

    private static NotSyncroSum notSyncroSum = new NotSyncroSum();

    public MySyncroThread2(String threadName) {

        mythread = new Thread(this, threadName);
        mythread.start();
    }

    public void run() {
        int a[] = {1,2,3,4,5};
        int sum = 0;
        synchronized (notSyncroSum) {
            sum=  notSyncroSum.getSum(a);
        }

        System.out.println(mythread.getName() +". In the main the sum is  " + sum);
    }


    public void waitFinish() {
        try {
            mythread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
