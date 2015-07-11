/**
 * Created by Garma on 11/07/2015.
 */
public class MyThread implements Runnable{

    private Thread mythread;
    private int timeToSleep;
    public MyThread(String threadName, int timeToSleep) {
        mythread = new Thread(this, threadName);
        this.timeToSleep = timeToSleep;
        mythread.start();
    }

    public void run() {
        String threadName = "Thread "+ mythread.getName();
        for (int i=0; i<5; i++) {

            try {
                System.out.println(threadName +" - Sto per dormire");
                Thread.sleep(timeToSleep);
                System.out.println(threadName + " - Mi sono svegliato");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public boolean isAlive() {
        return mythread.isAlive();
    }

    public void waitUntilToComplete() {
        try {
            mythread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
