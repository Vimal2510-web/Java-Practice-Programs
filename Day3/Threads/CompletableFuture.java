package Threads;
import java.util.concurrent.ExecutionException;

public class CompletableFuture {
	
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			return "Task completed";		
			});
		
		System.out.println("Processing..");
		System.out.println(future.get());
	}

}
