package dynamic_parameter;

import java.util.Comparator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DynamicParameterPractice {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread t = new Thread(() -> System.out.println("HELLO"));

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> callableTask = executorService.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("TTT");
                return "Finish";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        System.out.println(callableTask);

        System.out.println("HELLO TTT");




    }
}
