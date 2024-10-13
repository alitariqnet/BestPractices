package Java.concurrency;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String[] args) {
        Future f =  new CompletableFuture();

        ExecutorService e = new ForkJoinPool(2);
        Callable c =  new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("print something on screen...");
                System.out.println(Thread.currentThread().getName());
                return false;
            }
        };
//        f.exceptionNow();
        f = e.submit(c);
        try{
            System.out.println(Thread.currentThread().getName());
//            System.out.println("Future cancel -> "+f.cancel(false));
            System.out.println("Future is cancelled? -> "+f.isCancelled());
            System.out.println("Future is done? -> "+f.isDone());
            System.out.println("Future state? -> "+f.state());
            System.out.println("Future get() -> "+f.get());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
