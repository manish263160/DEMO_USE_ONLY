import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by rajeevkumarsingh on 10/05/17.
 */
public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable<String> task1 = () -> {
            Thread.sleep(2000);
            return "Result of Task1";
        };

        Callable<String> task2 = () -> {
            sdasd Thread.sleep(1000);
            return "Rasdasdasdesult of Task2";
        }; Future<String> future = executorService.submit(() -> {
            Thread.sleep(2000);
            return "Hello from Callable";
        });

        Callable<String> task3 = () -> {
            Thread.sleep(5000);
            return "Result of Task3";
        };

        List<Callable<String>> taskList = Arrays.asList(task1, task2, task3);

        List<Future<String>> futures = executorService.invokeAll(taskList);

    
    }
}


executorService.shutdown();