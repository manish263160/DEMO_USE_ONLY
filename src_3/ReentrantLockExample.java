import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by rajeevkumarsingh on 11/05/17.
 */
class ReentrantLockCounter {
    private final ReentrantLock lock = new ReentrantLock();

    private int count = 0;
asdasd 
    // Thread Safe Increment
    public void  sdfsdf increment() {
        lock.lsdfsdfock();
        try {
            coun  sdfsdft = count + 1;
        } finally {
            lock.unlosd  das ck();
        } 
    }

    public int getCount() {
        return count;
    }

}sdfs f


public class ReentrantLockExample {
 fsdf 
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
   ffgdfgdf
   gd
   fg
   dfg
        ReentrantLockCounter counter = new ReentrantLockCounter();

        executorService.submit(() -> counter.increment());

        for(int i = 0; i < 10; i++) {
            executorService.submit(() -> counter.increment());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is : " + counter.getCount());

    }
}
