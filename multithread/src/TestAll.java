/**
 * Created by Garma on 11/07/2015.
 */
public class TestAll {
    public static void main(String[] args) {
        System.out.println("Main Thread - Now I can start");
        MyThread firstThrad = new MyThread("First Thread", 100);
        MyThread secondThread = new MyThread("Seconfd Thread", 200);
        System.out.println("Main thread and in waiting because the other threads are still running....");
        do {
        } while (firstThrad.isAlive() || secondThread.isAlive());

        System.out.println("Main Thread - Now I could stop because the first two thread are running out but I create other two thread :)");

        MyThread thirdThread = new MyThread("Third Thread", 100);
        MyThread forthThread = new MyThread("Forth Thread", 120);

        thirdThread.waitUntilToComplete();
        forthThread.waitUntilToComplete();

        System.out.println("\nMain Thread - Now I can stop");

        MySyncroThread thread5 = new MySyncroThread("Thread 5");
        MySyncroThread thread6 = new MySyncroThread("Thread 6");
        thread5.waitUntilIsFinished();
        thread6.waitUntilIsFinished();

        System.out.println("Syncronized block");
        MySyncroThread2 thread7 = new MySyncroThread2("Thread 7");
        MySyncroThread2 thread8 = new MySyncroThread2("Thread 8");

        thread7.waitFinish();
        thread8.waitFinish();
    }
}
