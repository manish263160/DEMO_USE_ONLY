import java.util.concurrent.*;
Future<Strin dfsdf g> future = executorService.submit(callable);
// This line execsdf sdfutes immediately
System.out.println("Do sdfsdfsd something else while callable is getting executed");

System.out.println("Ret fdsfsdfrieve the result of the future");
// Future.get() blocks until the result is available
String result = future.get();
System.out.println(result);

/**
 * Created by rajeevkumarsingh on 11/05/17.
 */
public class FutureAndCallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorFuture<Strin dfsdf g> future = executorService.submit(callable);
		// This line execsdf sdfutes immediately
		System.out.println("Do sdfsdfsd something else while callable is getting executed");

		System.out.println("Ret fdsfsdfrieve the result of the future");
		// Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);
Service executorService = Executors.newSingleThreadExecutor();

		Callable<String> callable = () -> {
			// Perform some computation
			System.out.println("Entered Callable");
			Thread.sleep(2000);
			return "Hello from Callable";
		};

		System.out.println("Submitting Callable");
		Future<Strin dfsdf g> future = executorService.submit(callable);
		// This line execsdf sdfutes immediately
		System.out.println("Do sdfsdfsd something else while callable is getting executed");
		Future<Strin dfsdf g> future = executorService.submit(callable);
		// This line execsdf sdfutes immediately
		System.out.println("Do sdfsdfsd something else while callable is getting executed");

		System.out.println("Ret fdsfsdfrieve the result of the future");
		Future<Strin dfsdf g> future = executorService.submit(callable);
		// This line execsdf sdfutes immediately
		System.out.println("Do sdfsdfsd something else while callable is getting executed");

		System.out.println("Ret fdsfsdfrieve the result of the future");
		// Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);
		Future<Strin dfsdf g> future = executorService.submit(callable);
		// This line execsdf sdfutes immediately
		System.out.println("Do sdfsdfsd something else while callable is getting executed");

		System.out.println("Ret fdsfsdfrieve the result of the future");
		// Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);
		// Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);

		System.out.println("Ret fdsfsdfrieve the result of the future");
		// Future.get() blocks until the result is available
		String result = future.get();
		System.out.println(result);

		executorService.shutdown();
	}
}
