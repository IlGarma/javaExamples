/**
 * Created by Garma on 11/07/2015.
 */
public class NotSyncroSum {

    private int sum = 0;


    public int getSum(int a[]) {
        sum =0;
        for (int i = 0; i<a.length; i++) {

            sum+=a[i];
            System.out.println(Thread.currentThread().getName()+ ". The sum is "+sum);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    return sum;
    }

}
